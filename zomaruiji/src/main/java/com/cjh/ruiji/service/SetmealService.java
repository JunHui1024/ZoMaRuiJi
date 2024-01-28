package com.cjh.ruiji.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cjh.ruiji.dto.SetmealDto;
import com.cjh.ruiji.entity.Setmeal;

import java.util.List;

/**
 * @author cjh
 */
public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}
