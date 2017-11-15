package com.auto.user.pojo;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 *  Created by xc.xiong on 2017/9/5.
 *  用户资料实体类
 */
@Entity
@Table(name = "user_info")
public class UserInfo implements Serializable{

    private static final long serialVersionUID = -3267918083809259248L;

    /**
     * id
     */
    @Column(name = "id")
    @Id
    private Long id;

    /**
     *
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 第三方用户编号，用来同步第三方用户信息
     */
    @Column(name = "external_user_id")
    private String externalUserId;

    /**
     *
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 出生日期
     */
    @Column(name = "birth")
    private Date birth;

    /**
     * 性别
     */
    @Column(name = "gender")
    private Integer gender;

    /**
     * 身份证号码
     */
    @Column(name = "idcard")
    private String idcard;

    /**
     *
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 密码
     */
    @Column(name = "password")
    @JsonIgnore
    private String password;

    /**
     * 父id
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 肝功能
     */
    @Column(name = "liver_func_text")
    private String liverFuncText;

    /**
     * 肝功能
     */
    @Column(name = "liver_func")
    private Integer liverFunc;

    /**
     * 肾功能
     */
    @Column(name = "renal_func_text")
    private String renalFuncText;

    /**
     * 肾功能
     */
    @Column(name = "renal_func")
    private Integer renalFunc;

    /**
     * 身高
     */
    @Column(name = "height")
    private String height;

    /**
     * 体重
     */
    @Column(name = "weight")
    private String weight;

    /**
     * 女性特殊时期（月经期、备孕中、妊娠期、哺乳期、无）
     */
    @Column(name = "special_period")
    private String specialPeriod;

    /**
     * 顺产/剖宫产/产钳助产
     */
    @Column(name = "fertility_type")
    private String fertilityType;

    /**
     * 胎龄（出生的时候怀孕了多少周,范围值）
     */
    @Column(name = "gestational_age")
    private String gestationalAge;

    /**
     * 母乳喂养、人工喂养、混合喂养
     */
    @Column(name = "feed_type")
    private String feedType;

    /**
     * 既往史编码集合
     */
    @Column(name = "pastmedical_history_code")
    private String pastmedicalHistoryCode;

    /**
     * 既往史名称集合
     */
    @Column(name = "pastmedical_history_text")
    private String pastmedicalHistoryText;

    /**
     * 过敏史编码集合
     */
    @Column(name = "allergic_history_code")
    private String allergicHistoryCode;

    /**
     * 过敏史名称集合
     */
    @Column(name = "allergic_history_text")
    private String allergicHistoryText;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    /**
     * 用户 来源类型，h5=1
     */
    @Column(name = "in_type")
    private Integer inType;

    /**
     *
     */
    @Column(name = "incre_flag")
    private String increFlag;

    /**
     *
     */
    @Column(name = "opera_flag")
    private String operaFlag;

    /**
     *
     */
    @Column(name = "operate_type")
    private String operateType;

    /**
     *
     */
    @Column(name = "data_version")
    private Integer dataVersion;

    /**
     *
     */
    @Column(name = "version_evolution")
    private String versionEvolution;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }


    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return this.userId;
    }


    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    public String getExternalUserId() {
        return this.externalUserId;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }


    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getBirth() {
        return this.birth;
    }


    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getGender() {
        return this.gender;
    }


    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getIdcard() {
        return this.idcard;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }


    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return this.parentId;
    }


    public void setLiverFuncText(String liverFuncText) {
        this.liverFuncText = liverFuncText;
    }

    public String getLiverFuncText() {
        return this.liverFuncText;
    }


    public void setLiverFunc(Integer liverFunc) {
        this.liverFunc = liverFunc;
    }

    public Integer getLiverFunc() {
        return this.liverFunc;
    }


    public void setRenalFuncText(String renalFuncText) {
        this.renalFuncText = renalFuncText;
    }

    public String getRenalFuncText() {
        return this.renalFuncText;
    }


    public void setRenalFunc(Integer renalFunc) {
        this.renalFunc = renalFunc;
    }

    public Integer getRenalFunc() {
        return this.renalFunc;
    }


    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return this.height;
    }


    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight;
    }


    public void setSpecialPeriod(String specialPeriod) {
        this.specialPeriod = specialPeriod;
    }

    public String getSpecialPeriod() {
        return this.specialPeriod;
    }


    public void setFertilityType(String fertilityType) {
        this.fertilityType = fertilityType;
    }

    public String getFertilityType() {
        return this.fertilityType;
    }


    public void setGestationalAge(String gestationalAge) {
        this.gestationalAge = gestationalAge;
    }

    public String getGestationalAge() {
        return this.gestationalAge;
    }


    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public String getFeedType() {
        return this.feedType;
    }


    public void setPastmedicalHistoryCode(String pastmedicalHistoryCode) {
        this.pastmedicalHistoryCode = pastmedicalHistoryCode;
    }

    public String getPastmedicalHistoryCode() {
        return this.pastmedicalHistoryCode;
    }


    public void setPastmedicalHistoryText(String pastmedicalHistoryText) {
        this.pastmedicalHistoryText = pastmedicalHistoryText;
    }

    public String getPastmedicalHistoryText() {
        return this.pastmedicalHistoryText;
    }


    public void setAllergicHistoryCode(String allergicHistoryCode) {
        this.allergicHistoryCode = allergicHistoryCode;
    }

    public String getAllergicHistoryCode() {
        return this.allergicHistoryCode;
    }


    public void setAllergicHistoryText(String allergicHistoryText) {
        this.allergicHistoryText = allergicHistoryText;
    }

    public String getAllergicHistoryText() {
        return this.allergicHistoryText;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }


    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }


    public void setInType(Integer inType) {
        this.inType = inType;
    }

    public Integer getInType() {
        return this.inType;
    }


    public void setIncreFlag(String increFlag) {
        this.increFlag = increFlag;
    }

    public String getIncreFlag() {
        return this.increFlag;
    }


    public void setOperaFlag(String operaFlag) {
        this.operaFlag = operaFlag;
    }

    public String getOperaFlag() {
        return this.operaFlag;
    }


    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getOperateType() {
        return this.operateType;
    }


    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }

    public Integer getDataVersion() {
        return this.dataVersion;
    }


    public void setVersionEvolution(String versionEvolution) {
        this.versionEvolution = versionEvolution;
    }

    public String getVersionEvolution() {
        return this.versionEvolution;
    }

}
