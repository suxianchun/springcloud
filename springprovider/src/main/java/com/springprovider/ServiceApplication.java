package com.springprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by x.su on 2018-09-17.
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceApplication {

    public static void main(String args[])
    {
        SpringApplication.run(ServiceApplication.class,args);
    }

}
