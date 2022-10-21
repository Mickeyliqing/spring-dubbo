package com.example.springorder.service;

import com.example.springcommon.model.UserAddress;
import com.example.springcommon.service.IOrderService;
import com.example.springcommon.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 实现 spring-common 工程里面的 IOrderService 接口
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    private IUserService userService;

    @Override
    public UserAddress placeOrder(int userId) {
        UserAddress user = userService.getUserAddById(userId);
        System.out.println("用户地址：" + user.getUserAddress());
        return user;
    }
}
