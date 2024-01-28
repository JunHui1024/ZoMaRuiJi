package com.cjh.ruiji.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cjh.ruiji.entity.Orders;

/**
 * @author cjh
 */
public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
