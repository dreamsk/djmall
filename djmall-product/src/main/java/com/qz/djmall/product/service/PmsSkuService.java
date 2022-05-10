package com.qz.djmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.product.entity.PmsSkuEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author lk
 * @email lk@gmail.com
 * @date 2022-05-10 17:09:34
 */
public interface PmsSkuService extends IService<PmsSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

