package com.example.limits_services.controller;


import com.example.limits_services.model.LimitsModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class LimitsController {

    @GetMapping("limits")
    public LimitsModel getLimit() {
        LimitsModel model = new LimitsModel();
        model.setMaximum(100);

        return model;
    }

    @GetMapping("hello")
    public String sayHello() {
        return "hello";
    }
}
