package com.wyx.yumall.product;

import com.wyx.yumall.product.entity.BrandEntity;
import com.wyx.yumall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class YumallProductApplicationTests {

	@Autowired
	private BrandService brandService;


	@Test
	void contextLoads() {
	}

	@Test
	public void testBrandService(){
		BrandEntity be  = new BrandEntity();
		be.setName("华为");
		boolean save = brandService.save(be);
		System.out.println("保存：" + save);
		System.out.println(be);
	}

}
