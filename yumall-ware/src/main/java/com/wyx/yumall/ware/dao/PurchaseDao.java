package com.wyx.yumall.ware.dao;

import com.wyx.yumall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author wyx
 * @email wangyuxiang@gmail.com
 * @date 2021-12-09 23:23:18
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
