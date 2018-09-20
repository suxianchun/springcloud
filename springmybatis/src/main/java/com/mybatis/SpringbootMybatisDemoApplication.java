package com.mybatis;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Created by x.su on 2018-09-18.
 */
@SpringBootApplication

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootMybatisDemoApplication {

    public static void main(String args[])
    {
        SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
    }

}
