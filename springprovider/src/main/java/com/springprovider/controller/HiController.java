package com.springprovider.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by x.su on 2018-09-17.
 */
@RestController
@Slf4j
public class HiController {



    @RequestMapping("/hi")
    public String hi(String name)
    {

        return "hi :" + name;
    }

}
