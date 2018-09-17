package com.springribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by x.su on 2018-09-17.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Ribbon {

    public static void main(String args[])
    {
        SpringApplication.run(Ribbon.class,args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

}
