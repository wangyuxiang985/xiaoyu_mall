package com.wyx.yumall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.wyx.yumall.ware.dao")
@SpringBootApplication
public class YumallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(YumallWareApplication.class, args);
	}

}
