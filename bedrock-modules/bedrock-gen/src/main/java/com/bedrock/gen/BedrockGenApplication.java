package com.bedrock.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.bedrock.common.security.annotation.EnableCustomConfig;
import com.bedrock.common.security.annotation.EnableBedrockFeignClients;

/**
 * 代码生成
 */
@EnableCustomConfig
@EnableBedrockFeignClients
@SpringBootApplication
public class BedrockGenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(BedrockGenApplication.class, args);
        System.out.println("代码生成模块启动成功");
    }
}
