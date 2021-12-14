package com.wyx.yumall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.wyx.yumall.member.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class YumallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(YumallMemberApplication.class, args);
	}

}
