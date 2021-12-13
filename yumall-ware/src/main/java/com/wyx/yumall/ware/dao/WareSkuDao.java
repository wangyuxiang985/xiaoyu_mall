package com.wyx.yumall.ware.dao;

import com.wyx.yumall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author wyx
 * @email wangyuxiang@gmail.com
 * @date 2021-12-09 23:23:18
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
