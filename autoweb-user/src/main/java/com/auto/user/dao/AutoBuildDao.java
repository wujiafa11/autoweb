package com.auto.user.dao;

import com.auto.commons.core.dao.IBaseDao;
import com.auto.user.pojo.Column;
import com.auto.user.pojo.Database;
import com.auto.user.pojo.Table;

import java.util.List;

/**
 * Created by xc.xiong on 2017/9/30.
 */
public interface AutoBuildDao extends IBaseDao<Database, Long> {

    Table getTable(String tableName);

    List<Column> listColumn(String tableName);
}
