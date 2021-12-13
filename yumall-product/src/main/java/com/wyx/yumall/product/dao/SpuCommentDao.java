package com.wyx.yumall.product.dao;

import com.wyx.yumall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author wyx
 * @email wangyuxiang@gmail.com
 * @date 2021-12-09 23:18:28
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
