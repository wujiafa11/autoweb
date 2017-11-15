package com.auto.user.dao.impl;

import com.auto.user.dao.DiagnosisDiseaseDao;
import com.auto.user.pojo.DiagnosisDisease;
import com.auto.commons.core.dao.impl.BaseDao;
import com.auto.commons.core.sql.dto.DataRecord;
import com.auto.commons.core.util.JavaBeanMap;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* Created by auto build on 2017-10-09.
* 疾病表 DiagnosisDiseaseDaoImpl
*/
@Repository
public class DiagnosisDiseaseDaoImpl extends BaseDao<DiagnosisDisease, Long> implements DiagnosisDiseaseDao {

    private final String STATEMENT_HEAD = " com.auto.user.pojo.DiagnosisDisease";

    /**
    * 查询所有疾病表
    *
    * @return
    */
    public List<DiagnosisDisease> listDiagnosisDisease() {
        Map<String, Object> map = new HashMap<>();
        List<DataRecord> list = super.selectForList(STATEMENT_HEAD + ".queryDiagnosisDisease", map);
        List<DiagnosisDisease> diagnosisDiseases = JavaBeanMap.convertListToJavaBean(list, DiagnosisDisease.class);
        return diagnosisDiseases;
    }



    @Autowired
    public DiagnosisDiseaseDaoImpl(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    @Override
    public Class<DiagnosisDisease> getClz() {
        return DiagnosisDisease.class;
    }

}
