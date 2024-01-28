package com.cjh.ruiji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cjh.ruiji.entity.User;
import com.cjh.ruiji.mapper.UserMapper;
import com.cjh.ruiji.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author cjh
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
}
