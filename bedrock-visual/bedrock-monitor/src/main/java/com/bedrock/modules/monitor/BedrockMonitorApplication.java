package com.bedrock.modules.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 监控中心
 */
@EnableAdminServer
@SpringBootApplication
public class BedrockMonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(BedrockMonitorApplication.class, args);
        System.out.println("监控中心启动成功");
    }
}
