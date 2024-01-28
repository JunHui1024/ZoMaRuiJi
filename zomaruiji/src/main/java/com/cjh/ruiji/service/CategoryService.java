package com.cjh.ruiji.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cjh.ruiji.entity.Category;

/**
 * @author cjh
 */
public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
