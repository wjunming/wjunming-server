package com.wjunming.config;

import com.wjunming.base.ResultCode;
import com.wjunming.base.ResultEntity;
import com.wjunming.base.ResultMsg;
import com.wjunming.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局统一异常处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public <T> ResultEntity<T> handleIllegalArgumentException(IllegalArgumentException e) {
        log.error(e.getMessage(), e);
        return ResultEntity.fail(e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public <T> ResultEntity<T> handleBusinessException(BusinessException e) {
        log.error(e.getMessage(), e);
        return ResultEntity.fail(e.getMessage());
    }

    @ExceptionHandler(BindException.class)
    public <T> ResultEntity<T> handleBindException(BindException e) {
        String message = e.getBindingResult().getFieldError().getDefaultMessage();
        log.error(message, e);
        return ResultEntity.fail(ResultCode.ARGUMENT_NOT_VALID, message);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public <T> ResultEntity<T> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getFieldError().getDefaultMessage();
        log.error(message, e);
        return ResultEntity.fail(ResultCode.ARGUMENT_NOT_VALID, message);
    }

    @ExceptionHandler(Exception.class)
    public <T> ResultEntity<T> handleException(Exception e) {
        log.error(ResultMsg.ERROR.getMessage(), e);
        return ResultEntity.fail(ResultMsg.ERROR);
    }
}
