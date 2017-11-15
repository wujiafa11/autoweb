package com.auto.user.dao;

import com.auto.commons.core.dao.IBaseDao;
import com.auto.user.pojo.UserInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xc.xiong on 2017/9/5.
 * 用户信息Dao
 */
@Component
public interface UserInfoDao extends IBaseDao<UserInfo, Long> {

    /**
     * 查询所有用户信息
     *
     * @return
     */
    List<UserInfo> listUserInfo();

}
