package com.auto.user.dao.impl;

import com.auto.commons.core.dao.impl.BaseDao;
import com.auto.commons.core.sql.dto.DataRecord;
import com.auto.commons.core.util.JavaBeanMap;
import com.auto.user.dao.AutoBuildDao;
import com.auto.user.pojo.Column;
import com.auto.user.pojo.Database;
import com.auto.user.pojo.Table;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xc.xiong on 2017/9/30.
 */
@Repository
public class AutoBuildDaoImpl extends BaseDao<Database, Long> implements AutoBuildDao {

    private final String STATEMENT_HEAD = "com.auto.user.pojo.DataBaseConfig";

    @Autowired
    public AutoBuildDaoImpl(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    @Override
    public Class<Database> getClz() {
        return Database.class;
    }

    public Table getTable(String tableName){
        Map<String,Object> map=new HashMap<>();
        map.put("tableName", tableName);
        DataRecord dataRecord = super.selectForDataRecord(STATEMENT_HEAD + ".getTable", map);
        return (Table) JavaBeanMap.convertMap2JavaBean(dataRecord, Table.class);

    }

    public List<Column> listColumn(String tableName){
        Map<String,Object> map=new HashMap<>();
        map.put("tableName", tableName);
        List<DataRecord> dataRecords = super.selectForList(STATEMENT_HEAD + ".queryColumn", map);
        return JavaBeanMap.convertListToJavaBean(dataRecords, Column.class);
    }

}
