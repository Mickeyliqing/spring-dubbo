package com.example.springcommon.service;

import com.example.springcommon.model.UserAddress;

public interface IOrderService {

    /**
     * 用户下单接口
     * @param userId
     * @return
     */
    UserAddress placeOrder(int userId);
}
