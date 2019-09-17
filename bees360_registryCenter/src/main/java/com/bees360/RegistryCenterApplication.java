package com.bees360;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 深圳聚蜂智能科技有限公司 版权所有 © Copyright 2019
 *
 *
 * @Description:
 * @Project: bees360_cloud
 * @CreateDate: 2019/9/17 下午6:11
 * @Author: <a href="poker0325@me.com">jiankang.xia</a>
 */
@EnableEurekaServer
@SpringBootApplication
public class RegistryCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistryCenterApplication.class, args);
    }
}
