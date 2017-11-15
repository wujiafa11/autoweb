package com.auto.user.dao.impl;

import com.auto.commons.core.dao.impl.BaseDao;
import com.auto.commons.core.sql.dto.DataRecord;
import com.auto.commons.core.util.JavaBeanMap;
import com.auto.user.dao.UserInfoDao;
import com.auto.user.pojo.UserInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xc.xiong on 2017/9/5.
 * 用户信息Dao
 */
@Repository
public class UserInfoDaoImpl extends BaseDao<UserInfo, Long> implements UserInfoDao {

    @Autowired
    public UserInfoDaoImpl(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    @Override
    public Class<UserInfo> getClz() {
        return UserInfo.class;
    }

    private final String STATEMENT_HEAD = "com.auto.user.pojo.UserInfo";

    /**
     * 查询所有用户信息
     *
     * @return
     */
    public List<UserInfo> listUserInfo() {
        Map<String, Object> map = new HashMap<>();
        List<DataRecord> list = super.selectForList(STATEMENT_HEAD + ".queryUserInfo", map);
        List<UserInfo> userInfos = JavaBeanMap.convertListToJavaBean(list, UserInfo.class);
        return userInfos;
    }


}
