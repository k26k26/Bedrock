package com.bedrock.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.bedrock.common.security.annotation.EnableCustomConfig;
import com.bedrock.common.security.annotation.EnableBedrockFeignClients;

/**
 * 定时任务
 */
@EnableCustomConfig
@EnableBedrockFeignClients   
@SpringBootApplication
public class BedrockJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(BedrockJobApplication.class, args);
        System.out.println("定时任务模块启动成功");
    }
}
