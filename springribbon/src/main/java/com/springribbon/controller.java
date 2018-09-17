package com.springribbon;

import com.springribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

/**
 * Created by x.su on 2018-09-17.
 */
@RestController
public class controller {

    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name)
    {
        return hiService.hiService(name);
    }
}
