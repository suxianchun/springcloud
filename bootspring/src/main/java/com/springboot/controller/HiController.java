package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by x.su on 2018-09-19.
 */
@RestController
public class HiController {

    @RequestMapping("/hi")
    public String hi()
    {
        return "hello";
    }
}
