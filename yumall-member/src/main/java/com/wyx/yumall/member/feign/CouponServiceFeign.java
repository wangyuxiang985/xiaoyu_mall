package com.wyx.yumall.member.feign;

import com.wyx.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("yumall-coupon")
public interface CouponServiceFeign {

    @GetMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
