package com.qz.djmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.common.utils.PageUtils;
import com.qz.djmall.product.entity.PmsCategoryBrandEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author lk
 * @email lk@gmail.com
 * @date 2022-05-10 17:09:34
 */
public interface PmsCategoryBrandService extends IService<PmsCategoryBrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

