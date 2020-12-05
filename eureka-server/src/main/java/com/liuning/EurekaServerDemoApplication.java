package com.liuning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liuning
 * @date 2020/12/5 22:52
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerDemoApplication.class, args);
    }
}
