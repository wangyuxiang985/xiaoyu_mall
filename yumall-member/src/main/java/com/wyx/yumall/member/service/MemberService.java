package com.wyx.yumall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyx.common.utils.PageUtils;
import com.wyx.yumall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author wyx
 * @email wangyuxiang@gmail.com
 * @date 2021-12-09 23:22:33
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

