package com.springserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by x.su on 2018-09-14.
 */
@EnableEurekaServer
@SpringBootApplication
public class Server {

    public static void main(String args[])
    {
        SpringApplication.run(Server.class,args);
    }
}
