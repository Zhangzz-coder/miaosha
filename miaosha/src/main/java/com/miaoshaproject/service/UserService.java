package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;
import org.apache.catalina.User;

public interface UserService {
    //通过用户ID获取用户对象的方法
    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;


    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
