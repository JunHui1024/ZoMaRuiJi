package com.cjh.ruiji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cjh.ruiji.entity.Employee;
import com.cjh.ruiji.mapper.EmployeeMapper;
import com.cjh.ruiji.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author cjh
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
