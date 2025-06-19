package com.bedrock.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 文件服务
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BedrockFileApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(BedrockFileApplication.class, args);
        System.out.println("文件服务模块启动成功");
    }
}
