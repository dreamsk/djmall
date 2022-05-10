package com.qz.djmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.product.entity.PmsAttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lk
 * @email lk@gmail.com
 * @date 2022-05-10 17:09:34
 */
public interface PmsAttrService extends IService<PmsAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

