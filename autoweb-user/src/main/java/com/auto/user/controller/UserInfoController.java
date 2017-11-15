package com.auto.user.controller;

import com.auto.commons.web.ResponseMessage;
import com.auto.commons.web.ResponseStatus;
import com.auto.user.pojo.UserInfo;
import com.auto.user.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xc.xiong on 2017/9/5.
 * 用户信息Controller
 */
@RestController
@RequestMapping("/userinfo")
public class UserInfoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoController.class);

    @Resource
    private UserInfoService userInfoService;

    /**
     * 查询所有用户信息
     *
     * @return
     */
    @RequestMapping(value = {"list"}, produces = "application/json;charset=UTF-8")
    public ResponseMessage listUserInfo() {
        LOGGER.info("获取所有用户信息 .......................................");
        try {
            List<UserInfo> userInfos = userInfoService.listUserInfo();
            return new ResponseMessage(userInfos);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseStatus.EXCEPTION);
        }
    }

    /**
     * 查询单个用户信息
     *
     * @return
     */
    @RequestMapping(value = {"get"}, produces = "application/json;charset=UTF-8")
    public ResponseMessage getUserInfo(Long userId) {
        LOGGER.info("获取单个用户信息 .......................................");
        try {
            UserInfo userInfo = userInfoService.getUserInfo(userId);
            return new ResponseMessage(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseStatus.EXCEPTION);
        }
    }

    /**
     * 修改用户信息
     *
     * @return
     */
    @RequestMapping(value = {"update"}, produces = "application/json;charset=UTF-8")
    public ResponseMessage updateUserInfo(UserInfo userInfo) {
        LOGGER.info("修改用户信息 .......................................");
        try {
            int count = userInfoService.updateUserInfo(userInfo);
            return new ResponseMessage(count);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseStatus.EXCEPTION);
        }
    }

    /**
     * 删除用户信息
     *
     * @return
     */
    @RequestMapping(value = {"delete"}, produces = "application/json;charset=UTF-8")
    public ResponseMessage deleteUserInfo(Long userId) {
        LOGGER.info("删除用户信息 .......................................");
        try {
            int count = userInfoService.deleteUserInfo(userId);
            return new ResponseMessage(count);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage(ResponseStatus.EXCEPTION);
        }
    }


}
