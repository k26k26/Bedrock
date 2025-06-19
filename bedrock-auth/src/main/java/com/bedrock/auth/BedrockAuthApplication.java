package com.bedrock.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.bedrock.common.security.annotation.EnableBedrockFeignClients;

/**
 * 认证授权中心
 */
@EnableBedrockFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BedrockAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(BedrockAuthApplication.class, args);
        System.out.println("认证授权中心启动成功");
    }
}
