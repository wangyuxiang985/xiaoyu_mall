package com.wyx.yumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyx.common.utils.PageUtils;
import com.wyx.yumall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wyx
 * @email wangyuxiang@gmail.com
 * @date 2021-12-09 23:18:28
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

