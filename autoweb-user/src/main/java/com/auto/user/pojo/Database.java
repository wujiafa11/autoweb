package com.auto.user.pojo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Database implements Serializable {

	private static final long serialVersionUID = 4506825349291946162L;
	
	private String driverClassName;//数据库驱动名称
    private String url;     //数据连接字符串
    private String username;//数据库用户名
    private String password;//密码
    private List<Table> tableList=new ArrayList<>();//数据库表集合

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Table> getTableList() {
        return tableList;
    }

    public void setTableList(List<Table> tableList) {
        this.tableList = tableList;
    }

}
