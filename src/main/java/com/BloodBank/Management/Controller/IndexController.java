package com.BloodBank.Management.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
    @GetMapping("/")
    public String IndexFunnction(){
        return "Application Is Up";
    }
}
