package com.springprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by x.su on 2018-09-17.
 */
@RestController
public class HiController {

    @RequestMapping("/hi")
    public String hi(String name)
    {
        return "hi :" + name;
    }

}
