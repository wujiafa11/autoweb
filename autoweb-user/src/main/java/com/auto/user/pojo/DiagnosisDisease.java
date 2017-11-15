package com.auto.user.pojo;

import org.codehaus.jackson.annotate.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
* Created by auto build on 2017/10/09.
* 疾病表 DiagnosisDisease
*/
@Entity
@Table(name = "diagnosis_disease")
public class DiagnosisDisease implements Serializable{

    /**
    *id
    */
    @Id
    @Column(name = "id")
    private Integer id;
  
    /**
    *疾病编码
    */
    @Column(name = "disease_code")
    private String diseaseCode;
  
    /**
    *疾病名称
    */
    @Column(name = "disease_name")
    private String diseaseName;
  
    /**
    *通俗化名称(别名)
    */
    @Column(name = "popu_name")
    private String popuName;
  
    /**
    *性别
    */
    @Column(name = "gender")
    private Integer gender;
  
    /**
    *最小年龄
    */
    @Column(name = "min_age")
    private Double minAge;
  
    /**
    *最大年龄
    */
    @Column(name = "max_age")
    private Double maxAge;
  
    /**
    *是否常见病
    */
    @Column(name = "is_common")
    private String isCommon;
  
    /**
    *是否危重病
    */
    @Column(name = "is_grave")
    private String isGrave;
  
    /**
    *疾病定义
    */
    @Column(name = "definition")
    private String definition;
  
    /**
    *拼音助记符
    */
    @Column(name = "symbol")
    private String symbol;
  
    /**
    *特殊时期
    */
    @Column(name = "special_period")
    private Integer specialPeriod;
  
    /**
    *对应ICD10编码
    */
    @Column(name = "icd10_code")
    private String icd10Code;
  
    /**
    *同步时间（暂时不填）
    */
    @Column(name = "incre_flag")
    private String increFlag;
  
    /**
    *同步-操作时间
    */
    @Column(name = "opera_flag")
    private String operaFlag;
  
    /**
    *同步-操作类型（'I'增 ,'U'改,'D'删）
    */
    @Column(name = "operate_type")
    private String operateType;
  
    /**
    *同步-当前版本
    */
    @Column(name = "data_version")
    private Integer dataVersion;
  
    /**
    *同步-版本演变
    */
    @Column(name = "version_evolution")
    private String versionEvolution;
  
    /**
    *来源
    */
    @Column(name = "source_")
    private String source;
  
    /**
    *版本
    */
    @Column(name = "version_")
    private String version;
  
    /**
    *创建人
    */
    @Column(name = "creator")
    private String creator;
  
    /**
    *创建时间
    */
    @Column(name = "create_time")
    private Date createTime;
  
    /**
    *审核人
    */
    @Column(name = "reviewer")
    private String reviewer;
  
    /**
    *审核时间
    */
    @Column(name = "review_time")
    private Date reviewTime;
  
    /**
    *0 创建 ,1,审核 ，2，反审核，
    */
    @Column(name = "medical_data_status")
    private Integer medicalDataStatus;
  
    /**
    *0 默认 ，1,测试 ，2 ，上线
    */
    @Column(name = "it_data_status")
    private Integer itDataStatus;
  
    /**
    *对象版本 0 默认旧数据，1,儿童版 ，2 ，妇科版
    */
    @Column(name = "object_version")
    private Integer objectVersion;
  

    /**
     * 疾病表对象构造函数
     */
    public DiagnosisDisease() {
    }


    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getDiseaseCode(){
        return this.diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode){
        this.diseaseCode = diseaseCode;
    }

    public String getDiseaseName(){
        return this.diseaseName;
    }

    public void setDiseaseName(String diseaseName){
        this.diseaseName = diseaseName;
    }

    public String getPopuName(){
        return this.popuName;
    }

    public void setPopuName(String popuName){
        this.popuName = popuName;
    }

    public Integer getGender(){
        return this.gender;
    }

    public void setGender(Integer gender){
        this.gender = gender;
    }

    public Double getMinAge(){
        return this.minAge;
    }

    public void setMinAge(Double minAge){
        this.minAge = minAge;
    }

    public Double getMaxAge(){
        return this.maxAge;
    }

    public void setMaxAge(Double maxAge){
        this.maxAge = maxAge;
    }

    public String getIsCommon(){
        return this.isCommon;
    }

    public void setIsCommon(String isCommon){
        this.isCommon = isCommon;
    }

    public String getIsGrave(){
        return this.isGrave;
    }

    public void setIsGrave(String isGrave){
        this.isGrave = isGrave;
    }

    public String getDefinition(){
        return this.definition;
    }

    public void setDefinition(String definition){
        this.definition = definition;
    }

    public String getSymbol(){
        return this.symbol;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public Integer getSpecialPeriod(){
        return this.specialPeriod;
    }

    public void setSpecialPeriod(Integer specialPeriod){
        this.specialPeriod = specialPeriod;
    }

    public String getIcd10Code(){
        return this.icd10Code;
    }

    public void setIcd10Code(String icd10Code){
        this.icd10Code = icd10Code;
    }

    public String getIncreFlag(){
        return this.increFlag;
    }

    public void setIncreFlag(String increFlag){
        this.increFlag = increFlag;
    }

    public String getOperaFlag(){
        return this.operaFlag;
    }

    public void setOperaFlag(String operaFlag){
        this.operaFlag = operaFlag;
    }

    public String getOperateType(){
        return this.operateType;
    }

    public void setOperateType(String operateType){
        this.operateType = operateType;
    }

    public Integer getDataVersion(){
        return this.dataVersion;
    }

    public void setDataVersion(Integer dataVersion){
        this.dataVersion = dataVersion;
    }

    public String getVersionEvolution(){
        return this.versionEvolution;
    }

    public void setVersionEvolution(String versionEvolution){
        this.versionEvolution = versionEvolution;
    }

    public String getSource(){
        return this.source;
    }

    public void setSource(String source){
        this.source = source;
    }

    public String getVersion(){
        return this.version;
    }

    public void setVersion(String version){
        this.version = version;
    }

    public String getCreator(){
        return this.creator;
    }

    public void setCreator(String creator){
        this.creator = creator;
    }

    public Date getCreateTime(){
        return this.createTime;
    }

    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    public String getReviewer(){
        return this.reviewer;
    }

    public void setReviewer(String reviewer){
        this.reviewer = reviewer;
    }

    public Date getReviewTime(){
        return this.reviewTime;
    }

    public void setReviewTime(Date reviewTime){
        this.reviewTime = reviewTime;
    }

    public Integer getMedicalDataStatus(){
        return this.medicalDataStatus;
    }

    public void setMedicalDataStatus(Integer medicalDataStatus){
        this.medicalDataStatus = medicalDataStatus;
    }

    public Integer getItDataStatus(){
        return this.itDataStatus;
    }

    public void setItDataStatus(Integer itDataStatus){
        this.itDataStatus = itDataStatus;
    }

    public Integer getObjectVersion(){
        return this.objectVersion;
    }

    public void setObjectVersion(Integer objectVersion){
        this.objectVersion = objectVersion;
    }
}