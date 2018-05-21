package com.zhkkj.zwb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Administrator on 2018/4/12/012.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableRedisHttpSession
public class OrderServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServerApplication.class,args);
    }
}
