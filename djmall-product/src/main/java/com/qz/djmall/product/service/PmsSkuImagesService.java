package com.qz.djmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.product.entity.PmsSkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author lk
 * @email lk@gmail.com
 * @date 2022-05-10 17:09:34
 */
public interface PmsSkuImagesService extends IService<PmsSkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

