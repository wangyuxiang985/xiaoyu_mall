package com.wyx.yumall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyx.common.utils.PageUtils;
import com.wyx.yumall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author wyx
 * @email wangyuxiang@gmail.com
 * @date 2021-12-09 23:22:33
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

