package com.wyx.yumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyx.common.utils.PageUtils;
import com.wyx.yumall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author wyx
 * @email wangyuxiang@gmail.com
 * @date 2021-12-09 23:18:28
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

