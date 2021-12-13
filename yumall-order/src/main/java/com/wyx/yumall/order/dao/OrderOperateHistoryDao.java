package com.wyx.yumall.order.dao;

import com.wyx.yumall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author wyx
 * @email wangyuxiang@gmail.com
 * @date 2021-12-09 23:20:53
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
