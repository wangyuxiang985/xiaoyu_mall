package com.wyx.yumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyx.common.utils.PageUtils;
import com.wyx.yumall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author wyx
 * @email wangyuxiang@gmail.com
 * @date 2021-12-09 23:18:28
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

