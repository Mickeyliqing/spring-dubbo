package com.example.springcommon.service;

import com.example.springcommon.model.UserAddress;

public interface IUserService {

    /**
     * 根据 ID 获取用户地址
     * @param userId
     * @return
     */
    UserAddress getUserAddById(int userId);
}
