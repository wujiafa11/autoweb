package com.auto.user.dao;

import com.auto.user.pojo.DiagnosisDisease;
import com.auto.commons.core.dao.IBaseDao;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* Created by auto build on 2017/10/10.
* 疾病表 DiagnosisDiseaseDao
*/
@Component
public interface DiagnosisDiseaseDao extends IBaseDao<DiagnosisDisease, Long> {

    /**
    * 查询所有疾病表
    *
    * @return
    */
    List<DiagnosisDisease> listDiagnosisDisease();

}
