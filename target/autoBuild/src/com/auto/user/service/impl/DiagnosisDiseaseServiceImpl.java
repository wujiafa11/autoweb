package com.auto.user.service.impl;

import com.auto.user.pojo.DiagnosisDisease;
import com.auto.user.dao.DiagnosisDiseaseDao;
import com.auto.user.service.DiagnosisDiseaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by auto build on 2017/10/10.
* 疾病表 DiagnosisDiseaseServiceImpl
*/
@Service
@Transactional
public class DiagnosisDiseaseServiceImpl implements DiagnosisDiseaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DiagnosisDiseaseServiceImpl.class);

    @Resource
    private DiagnosisDiseaseDao diagnosisDiseaseDao;

    /**
    * 查询所有疾病表
    *
    * @return
    */
    public List<DiagnosisDisease> listDiagnosisDisease() {
        List<DiagnosisDisease> diagnosisDiseases = diagnosisDiseaseDao.listDiagnosisDisease();
        return diagnosisDiseases;
    }

    /**
    * 查询单个疾病表
    * @param id
    * @return
    */
    public DiagnosisDisease getDiagnosisDisease(Long id){
        return diagnosisDiseaseDao.get(id);
    }

    /**
    * 修改疾病表
    * @param diagnosisDisease
    * @return
    */
    public int updateDiagnosisDisease(DiagnosisDisease diagnosisDisease){
        return diagnosisDiseaseDao.update(diagnosisDisease);
    }

    /**
    * 删除疾病表
    * @param id
    * @return
    */
    public int deleteDiagnosisDisease(Long id){
        return diagnosisDiseaseDao.delete(id);
    }

}
