package com.wjunming.config;

import com.wjunming.util.SnowFlakeIdUtils;
import lombok.RequiredArgsConstructor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.generator.Generator;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class IdGenerator implements IdentifierGenerator, Generator {

    private final SnowFlakeIdUtils snowFlakeIdUtils;

    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
        return snowFlakeIdUtils.nextId();
    }
}
