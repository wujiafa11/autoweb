package com.auto.user.service.impl;

import com.auto.user.dao.UserInfoDao;
import com.auto.user.pojo.UserInfo;
import com.auto.user.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xc.xiong on 2017/9/5.
 * 用户信息 UserInfoServiceImpl
 */
@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Resource
    private UserInfoDao uesrInfoDao;

    /**
     * 查询所有用户信息
     *
     * @return
     */
    public List<UserInfo> listUserInfo() {
        List<UserInfo> userInfos = uesrInfoDao.listUserInfo();
        return userInfos;
    }

    /**
     * 查询单个用户信息
     * @param userId
     * @return
     */
    public UserInfo getUserInfo(Long userId){
        return uesrInfoDao.get(userId);
    }

    /**
     * 修改用户信息
     * @param userInfo
     * @return
     */
    public int updateUserInfo(UserInfo userInfo){
        return uesrInfoDao.update(userInfo);
    }

    /**
     * 删除用户信息
     * @param userId
     * @return
     */
    public int deleteUserInfo(Long userId){
        return uesrInfoDao.delete(userId);
    }


}
