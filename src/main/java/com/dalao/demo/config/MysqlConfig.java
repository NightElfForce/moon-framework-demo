package com.dalao.demo.config;


import com.hero.spa.orm.annotation.MySqlConfig;

@MySqlConfig
public class MysqlConfig {

    public String userName = "root";
    public String password = "123456";
    public String driverName = "com.mysql.jdbc.Driver";
    public String url = "jdbc:mysql://localhost:3306/wuxi?serverTimezone=UTC";



    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
