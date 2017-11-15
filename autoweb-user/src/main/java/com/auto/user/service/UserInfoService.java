package com.auto.user.service;


import com.auto.user.pojo.UserInfo;

import java.util.List;

/**
 * Created by xc.xiong on 2017/9/5.
 * 用户信息 UserInfoService
 */
public interface UserInfoService {

    /**
     * 查询所有用户信息
     *
     * @return
     */
    List<UserInfo> listUserInfo();

    /**
     * 查询单个用户信息
     *
     * @param userId
     * @return
     */
    UserInfo getUserInfo(Long userId);


    /**
     * 修改用户信息
     *
     * @param userInfo
     * @return
     */
    int updateUserInfo(UserInfo userInfo);

    /**
     * 删除用户信息
     *
     * @param userId
     * @return
     */
    int deleteUserInfo(Long userId);



}
