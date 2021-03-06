package com.springribbon.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by x.su on 2018-09-17.
 */
@Service
public class HiService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name)
    {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);

    }
}
