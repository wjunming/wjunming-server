package com.wjunming.base;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
//    @GeneratedValue(generator = "id-generator")
//    @IdGeneratorType(IdGenerator.class)
    private Long id;

    @Version
    private Long version;

    private Integer deleted;

    @CreatedBy
    @Column(updatable = false)
    private Long createdBy;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdTime;

    @LastModifiedBy
    private Long updatedBy;

    @LastModifiedDate
    private LocalDateTime updatedTime;
}
