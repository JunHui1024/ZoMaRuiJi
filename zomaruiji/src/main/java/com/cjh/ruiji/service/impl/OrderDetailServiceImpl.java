package com.cjh.ruiji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cjh.ruiji.entity.OrderDetail;
import com.cjh.ruiji.mapper.OrderDetailMapper;
import com.cjh.ruiji.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * @author cjh
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}