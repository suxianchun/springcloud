package com.springboot;

import com.springboot.filter.CustomerFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

/**
 * Created by x.su on 2018-09-19.
 */
@SpringBootApplication
//@ServletComponentScan
@Slf4j
public class Springboot {

    public static void main(String args[])
    {
        SpringApplication.run(Springboot.class,args);
        log.info("server started ");
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean()
    {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(customer());
        filterRegistrationBean.setOrder(10);
        filterRegistrationBean.setName("customerfilter");
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
    @Bean
    public Filter customer()
    {
        return new CustomerFilter();
    }

}
