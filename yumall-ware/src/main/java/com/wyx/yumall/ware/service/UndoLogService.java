package com.wyx.yumall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyx.common.utils.PageUtils;
import com.wyx.yumall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author wyx
 * @email wangyuxiang@gmail.com
 * @date 2021-12-09 23:23:18
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

