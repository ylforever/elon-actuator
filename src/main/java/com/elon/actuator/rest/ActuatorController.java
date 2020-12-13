package com.elon.actuator.rest;

import com.elon.actuator.service.CustomMetrics;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/actuator")
@Api(tags = "Spring actuator测试接口")
public class ActuatorController {
    @Autowired
    private CustomMetrics customMetrics;

    @PostMapping("/set-value1")
    @ApiOperation(value = "设置指标1的值")
    public void setCustomValue1(@RequestBody double value) {
        customMetrics.setValue1(value);
    }

    @PostMapping("/set-value2")
    @ApiOperation(value = "设置指标2的值")
    public void setCustomValue2(@RequestBody double value) {
        customMetrics.setValue2(value);
    }
}
