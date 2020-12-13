package com.elon.actuator.service;

import com.google.common.util.concurrent.AtomicDouble;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

/**
 * 自定义度量指标
 *
 * @author elon
 * @since 2020-12-13
 */
@Component
public class CustomMetrics {
    // 保存自定义度量指标值
    private AtomicDouble value1 = new AtomicDouble(0);
    private AtomicDouble value2 = new AtomicDouble(0);

    public CustomMetrics(MeterRegistry registry) {
        // 注册指标
        registry.gauge("custom.metrics1", value1);
        registry.gauge("custom.metrics2", value2);
    }

    public void setValue1(double value1) {
        this.value1.set(value1);
    }

    public void setValue2(double value2) {
        this.value2.set(value2);
    }
}
