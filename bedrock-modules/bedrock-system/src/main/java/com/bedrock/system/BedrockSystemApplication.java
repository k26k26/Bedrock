package com.bedrock.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.bedrock.common.security.annotation.EnableCustomConfig;
import com.bedrock.common.security.annotation.EnableBedrockFeignClients;

/**
 * 系统模块
 */
@EnableCustomConfig
@EnableBedrockFeignClients
@SpringBootApplication
public class BedrockSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(BedrockSystemApplication.class, args);
        System.out.println("系统模块启动成功");
    }
}
