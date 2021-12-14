package com.wyx.yumall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.wyx.yumall.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class YumallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(YumallCouponApplication.class, args);
	}

}
