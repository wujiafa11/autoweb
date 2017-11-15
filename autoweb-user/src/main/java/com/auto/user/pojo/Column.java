package com.auto.user.pojo;


import com.auto.user.uitl.StringUtil;

import java.io.Serializable;


public class Column implements Serializable {

    private static final long serialVersionUID = 4761199922482795070L;

    private String columnName;//字段英文名称
    private String columnComment;//字段注释（中文名）
    private String dataType;//jdbc数据类型
    private String nullable;//允许为空
    private String columnKey;//主键字段
    private Long maximumLength;//字段长度
    private Integer numericScale;//字段精度


    public String getDataType() {
        String ibatisType = getIbatisType();
        if (ibatisType == null) return "String";
        else if (ibatisType.equals("VARCHAR")) return "String";
        else if (ibatisType.equals("TEXT")) return "String";
        else if (ibatisType.equals("CLOB")) return "String";
        else if (ibatisType.equals("NUMERIC")) return (numericScale == null || numericScale == 0) ? (numericScale < 10 ? "Integer" : "Long") : "Double";
        else if (ibatisType.equals("TIMESTAMP")) return "Date";
        else if (ibatisType.equals("BLOB")) return "byte[]";
        else return "String";
    }

    public String getIbatisType() {
        if (dataType == null) {
            return null;
        }
        dataType=dataType.toUpperCase();
        if (dataType.equalsIgnoreCase("CHAR")) return "VARCHAR";
        else if (dataType.equalsIgnoreCase("NCHAR")) return "VARCHAR";
        else if (dataType.equalsIgnoreCase("VARCHAR")) return "VARCHAR";
        else if (dataType.equalsIgnoreCase("VARCHAR2")) return "VARCHAR";
        else if (dataType.equalsIgnoreCase("NVARCHAR2")) return "VARCHAR";

        else if (dataType.equalsIgnoreCase("NUMBER")) return "NUMERIC";
        else if (dataType.equalsIgnoreCase("NUMERIC")) return "NUMERIC";
        else if (dataType.equalsIgnoreCase("DECIMAL")) return "NUMERIC";
        else if (dataType.equalsIgnoreCase("DEC")) return "NUMERIC";
        else if (dataType.equalsIgnoreCase("MONEY")) return "NUMERIC";
        else if (dataType.equalsIgnoreCase("FLOAT")) return "NUMERIC";
        else if (dataType.equalsIgnoreCase("DOUBLE")) return "NUMERIC";
        else if (dataType.equalsIgnoreCase("REAL")) return "NUMERIC";
        else if (dataType.equalsIgnoreCase("INT")) return "NUMERIC";
        else if (dataType.equalsIgnoreCase("INTEGER")) return "NUMERIC";
        else if (dataType.equalsIgnoreCase("BIGINT")) return "NUMERIC";
        else if (dataType.equalsIgnoreCase("TINYINT")) return "NUMERIC";
        else if (dataType.equalsIgnoreCase("SMALLINT")) return "NUMERIC";

        else if (dataType.equalsIgnoreCase("DATE")) return "TIMESTAMP";
        else if (dataType.equalsIgnoreCase("DATETIME")) return "TIMESTAMP";
        else if (dataType.equalsIgnoreCase("TIME")) return "TIMESTAMP";
        else if (dataType.equalsIgnoreCase("TIMESTAMP")) return "TIMESTAMP";
        else if (dataType.equalsIgnoreCase("TIMESTAMP(6)")) return "TIMESTAMP";

        else if (dataType.equalsIgnoreCase("TEXT")) return "TEXT";
        else if (dataType.equalsIgnoreCase("LONGVARCHAR")) return "TEXT";
        else if (dataType.equalsIgnoreCase("CLOB")) return "CLOB";

        else if (dataType.equalsIgnoreCase("LONGVARBINARY")) return "BLOB";
        else if (dataType.equalsIgnoreCase("BLOB")) return "BLOB";
        else if (dataType.equalsIgnoreCase("IMAGE")) return "BLOB";

        else return "VARCHAR";
    }

    public String getMax() {
        String n = "";
        if (getDataType().equals("Integer") || getDataType().equals("Long")) {
            for (int i = 0; i < maximumLength; i++) n += "9";
        } else if (getDataType().equals("Double")) {
            for (int i = 0; i < maximumLength - numericScale; i++) n += "9";
            n += ".";
            for (int i = 0; i < numericScale; i++) n += "9";
        }
        return n;
    }

    public String getFieldName() {
        try {
            StringBuffer fieldName = new StringBuffer();
            String str[] = columnName.toLowerCase().split("_");
            for (int i = 0; i < str.length;i++) {
                if(i==0)
                    fieldName.append(str[i]);
                else
                    fieldName.append(StringUtil.upperFirstChar(str[i].toLowerCase()));
            }
            return fieldName.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return columnName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }


    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getNullable() {
        return nullable;
    }

    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    public String getColumnKey() {
        return columnKey;
    }

    public void setColumnKey(String columnKey) {
        this.columnKey = columnKey;
    }

    public Long getMaximumLength() {
        return maximumLength;
    }

    public void setMaximumLength(Long maximumLength) {
        this.maximumLength = maximumLength;
    }

    public Integer getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(Integer numericScale) {
        this.numericScale = numericScale;
    }


}
