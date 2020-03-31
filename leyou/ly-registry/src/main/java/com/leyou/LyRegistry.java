package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

/**
 * @Author tjy
 * @Date 2020/3/31 18:46
 */
@EnableEurekaServer
@SpringBootApplication
public class LyRegistry {
    public static void main(String[] args) {
        SpringApplication.run(LyRegistry.class);
    }
}
