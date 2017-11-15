package com.auto.user.service;

import com.auto.user.pojo.DiagnosisDisease;

import java.util.List;

/**
* Created by auto build on 2017/10/09.
* 疾病表 DiagnosisDiseaseService
*/
public interface DiagnosisDiseaseService {

    /**
    * 查询所有疾病表
    *
    * @return
    */
    List<DiagnosisDisease> listDiagnosisDisease();

    /**
    * 查询单个疾病表
    *
    * @param id
    * @return
    */
    DiagnosisDisease getDiagnosisDisease(Long id);


    /**
    * 修改疾病表
    *
    * @param diagnosisDisease
    * @return
    */
    int updateDiagnosisDisease(DiagnosisDisease diagnosisDisease);

    /**
    * 删除疾病表
    *
    * @param id
    * @return
    */
    int deleteDiagnosisDisease(Long id);

}
