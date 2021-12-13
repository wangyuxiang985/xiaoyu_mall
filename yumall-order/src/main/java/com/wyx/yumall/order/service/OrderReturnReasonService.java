package com.wyx.yumall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyx.common.utils.PageUtils;
import com.wyx.yumall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author wyx
 * @email wangyuxiang@gmail.com
 * @date 2021-12-09 23:20:53
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

