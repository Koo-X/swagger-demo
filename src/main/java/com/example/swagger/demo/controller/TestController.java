package com.example.swagger.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api(value = "/test", description = "测试接口集合")
public class TestController {

    @GetMapping("/test")
    @ApiOperation(
            value = "打印输入值",
            notes = "获取姓名，年龄打印信息",
            response = String.class,
            tags = {"测试接口"})
    public String Test(@ApiParam(value = "姓名") String name, @ApiParam(value = "年龄")Integer age) {
        return "我是" + name + ",年龄" + age;
    }
}
