package com.wyx.yumall.coupon.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wyx.yumall.coupon.entity.HomeAdvEntity;
import com.wyx.yumall.coupon.service.HomeAdvService;
import com.wyx.common.utils.PageUtils;
import com.wyx.common.utils.R;



/**
 * 首页轮播广告
 *
 * @author wyx
 * @email wangyuxiang@gmail.com
 * @date 2021-12-09 23:24:22
 */
@RestController
@RequestMapping("coupon/homeadv")
public class HomeAdvController {
    @Autowired
    private HomeAdvService homeAdvService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeAdvService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		HomeAdvEntity homeAdv = homeAdvService.getById(id);

        return R.ok().put("homeAdv", homeAdv);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HomeAdvEntity homeAdv){
		homeAdvService.save(homeAdv);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HomeAdvEntity homeAdv){
		homeAdvService.updateById(homeAdv);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		homeAdvService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
