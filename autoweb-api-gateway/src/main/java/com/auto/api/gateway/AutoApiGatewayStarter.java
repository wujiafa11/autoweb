package com.auto.api.gateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.auto.**.mapper")
@ServletComponentScan(basePackages={"com.auto"})
@ComponentScan(basePackages={"com.auto"})
@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class AutoApiGatewayStarter {
    public static void main(String[] args) {
        SpringApplication.run(AutoApiGatewayStarter.class, args);
    }
}
