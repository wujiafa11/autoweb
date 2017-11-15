package com.auto.user.pojo;

import com.auto.user.uitl.StringUtil;
import org.codehaus.jackson.annotate.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Table implements Serializable {
	
	private static final long serialVersionUID = -7703109005640698128L;
	
	private Integer id; //表id
    private String tableName;//表名称
    private String tableComment;//表注释
    private List<Column> columnList=new ArrayList<>();//字段集合
    private Boolean buildCURD;//生成增删改查维护
    private String subjectModuleName;   //子模块名

    public String getClassDomain(){
        /*int index = name.indexOf("_");
        String className = index != -1 ? name.substring(1 + index) : name;*/
    	String className = tableName;
        String[] arrStr = className.split("_");
        className = "";
        for (String s : arrStr) {
            className += StringUtil.upperFirstChar(s.toLowerCase());
        }
        return className;
    }
    public String getClassDomainLower(){
        return getClassDomain().substring(0, 1).toLowerCase() + getClassDomain().substring(1);
    }

    public String getClassController(){
        return getClassDomain()+"Controller";
    }

    public String getClassService(){
        return getClassDomain()+"Service";
    }
    public String getClassServiceLower(){
        return getClassDomain().substring(0, 1).toLowerCase() + getClassDomain().substring(1)+"Service";
    }
    public String getClassServiceImpl(){
        return getClassDomain()+"ServiceImpl";
    }

    public String getClassDaoLower(){
        return getClassDomain().substring(0, 1).toLowerCase() + getClassDomain().substring(1)+"Dao";
    }

      public String getClassDao(){
        return getClassDomain()+"Dao";
    }

    public String getClassDaoImpl(){
        return getClassDomain()+"DaoImpl";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public List<Column> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<Column> columnList) {
        this.columnList = columnList;
    }

    public Boolean getBuildCURD() {
        return buildCURD;
    }

    public void setBuildCURD(Boolean buildCURD) {
        this.buildCURD = buildCURD;
    }

    public String getSubjectModuleName() {
        return subjectModuleName;
    }

    public void setSubjectModuleName(String subjectModuleName) {
        this.subjectModuleName = subjectModuleName;
    }

    public String getModuleName() {
    	/*
        int index= name.indexOf("_");
        if(index!=-1) return name.substring(0,index).toLowerCase();
        else return "";
        */
    	return "";
    }

    @JsonIgnore(value = true)
    public String getPackageDao(){
        String packageName="com.auto";
        if (!StringUtil.isEmpty(this.getModuleName())) packageName+="."+this.getModuleName();
        if (!StringUtil.isEmpty(this.getSubjectModuleName())) packageName+="."+this.getSubjectModuleName();
        packageName+=".dao";
        return packageName;
    }@JsonIgnore(value = true)

    public String getPackageDaoImpl(){
        String packageName="com.auto";
        if (!StringUtil.isEmpty(this.getModuleName())) packageName+="."+this.getModuleName();
        if (!StringUtil.isEmpty(this.getSubjectModuleName())) packageName+="."+this.getSubjectModuleName();
        packageName+=".dao.impl";
        return packageName;
    }

    @JsonIgnore(value = true)
    public String getPackageDomain(){
        String packageName="com.auto";
        if (!StringUtil.isEmpty(this.getModuleName())) packageName+="."+this.getModuleName();
        if (!StringUtil.isEmpty(this.getSubjectModuleName())) packageName+="."+this.getSubjectModuleName();
        packageName+=".pojo";
        return packageName;
    }

    @JsonIgnore(value = true)
    public String getPackageController(){
        String packageName="com.auto";
        if (!StringUtil.isEmpty(this.getModuleName())) packageName+="."+this.getModuleName();
        if (!StringUtil.isEmpty(this.getSubjectModuleName())) packageName+="."+this.getSubjectModuleName();
        packageName+=".controller";
        return packageName;
    }

    @JsonIgnore(value = true)
    public String getPackageService(){
        String packageName="com.auto";
        if (!StringUtil.isEmpty(this.getModuleName())) packageName+="."+this.getModuleName();
        if (!StringUtil.isEmpty(this.getSubjectModuleName())) packageName+="."+this.getSubjectModuleName();
        packageName+=".service";
        return packageName;
    }

    @JsonIgnore(value = true)
    public String getPackageServiceImpl(){
        String packageName="com.auto";
        if (!StringUtil.isEmpty(this.getModuleName())) packageName+="."+this.getModuleName();
        if (!StringUtil.isEmpty(this.getSubjectModuleName())) packageName+="."+this.getSubjectModuleName();
        packageName+=".service.impl";
        return packageName;
    }

    @JsonIgnore(value = true)
    public String getMappings(){
        String mappings = "";
        if (!StringUtil.isEmpty(this.getModuleName())) mappings += "/" + this.getModuleName();
        if (!StringUtil.isEmpty(this.getSubjectModuleName())) mappings+="/"+this.getSubjectModuleName();
        mappings += "/" + StringUtil.lowerFirstChar(getClassDomain()) + "_*.do";
        return mappings;
    }

    public String getPk(){
        if(this.columnList!=null&&this.columnList.size()>0){
            for(Column column:columnList){
                if("PRI".equals(column.getColumnKey())) return column.getColumnName();
            }
            return columnList.get(0).getColumnName();
        }
        else{
            return "";
        }
    }
}
