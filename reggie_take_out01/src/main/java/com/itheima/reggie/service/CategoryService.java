package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/**
 * @author cjh
 */
public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}