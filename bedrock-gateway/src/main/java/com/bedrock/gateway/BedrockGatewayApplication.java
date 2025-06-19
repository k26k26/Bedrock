package com.bedrock.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BedrockGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(BedrockGatewayApplication.class, args);
        System.out.println("网关启动成功");
    }
}
