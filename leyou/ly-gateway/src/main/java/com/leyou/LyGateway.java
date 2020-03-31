package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author tjy
 * @Date 2020/3/31 19:06
 */

@EnableZuulProxy
@SpringBootApplication
public class LyGateway {

    public static void main(String[] args) {
        SpringApplication.run(LyGateway.class);
    }
}
