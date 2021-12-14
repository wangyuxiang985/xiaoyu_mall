package com.wyx.yumall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.wyx.yumall.order.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class YumallOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(YumallOrderApplication.class, args);
	}

}
