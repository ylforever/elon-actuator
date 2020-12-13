package com.elon.actuator.service;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

/**
 * 自定义健康检查指标
 *
 * @author elon
 * @since 2020-12-13
 */
@Component
public class CustomHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        Health.Builder builder = new Health.Builder();
        builder.status(Status.UP);

        /**
         * 搜集所有自定义指标数据，封装到Health中返回
         */
        builder.withDetail("自定义健康指标1", "正常").withDetail("自定义健康指标2", "异常");

        return builder.build();
    }
}
