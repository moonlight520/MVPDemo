package com.mvpdemo.bean;

import java.io.Serializable;

/**
 * Created by moon on 2016/4/20.
 */
public class UserInfoBean implements Serializable{
    private String USERID;
    private String USERNAME;
    private String DEPTID;
    private String CUSTOMID;
    private String ROLEKEY;//角色值
    private String BZ_NAME;// 班组名称
    private String BZ_ID ;// 班组  id
    private String CJ_NAME;// 车间名称
    private String CJ_ID;   // 车间 id
    private String LOGINT_TYPE;//登陆类型

    private String COUNT_IN_MONTH;//每月被派工次数

    public UserInfoBean(String COUNT_IN_MONTH, String USERNAME, String DEPTID, String CUSTOMID, String ROLEKEY, String BZ_NAME, String BZ_ID, String CJ_NAME, String CJ_ID, String LOGINT_TYPE, String USERID) {
        this.COUNT_IN_MONTH = COUNT_IN_MONTH;
        this.USERNAME = USERNAME;
        this.DEPTID = DEPTID;
        this.CUSTOMID = CUSTOMID;
        this.ROLEKEY = ROLEKEY;
        this.BZ_NAME = BZ_NAME;
        this.BZ_ID = BZ_ID;
        this.CJ_NAME = CJ_NAME;
        this.CJ_ID = CJ_ID;
        this.LOGINT_TYPE = LOGINT_TYPE;
        this.USERID = USERID;
    }

    public String getLOGINT_TYPE() {
        return LOGINT_TYPE;
    }

    public void setLOGINT_TYPE(String LOGINT_TYPE) {
        this.LOGINT_TYPE = LOGINT_TYPE;
    }

    public String getROLEKEY() {
        return ROLEKEY;
    }

    public void setROLEKEY(String ROLENAME) {
        this.ROLEKEY = ROLEKEY;
    }

    public String getUSERID() {
        return USERID;
    }
    public void setUSERID(String uSERID) {
        USERID = uSERID;
    }
    public String getUSERNAME() {
        return USERNAME;
    }
    public void setUSERNAME(String uSERNAME) {
        USERNAME = uSERNAME;
    }
    public String getDEPTID() {
        return DEPTID;
    }
    public void setDEPTID(String dEPTID) {
        DEPTID = dEPTID;
    }
    public String getCUSTOMID() {
        return CUSTOMID;
    }
    public void setCUSTOMID(String cUSTOMID) {
        CUSTOMID = cUSTOMID;
    }

    public String getBZ_NAME() {
        return BZ_NAME;
    }

    public String getBZ_ID() {
        return BZ_ID;
    }

    public String getCJ_NAME() {
        return CJ_NAME;
    }

    public String getCJ_ID() {
        return CJ_ID;
    }

    public void setBZ_NAME(String BZ_NAME) {
        this.BZ_NAME = BZ_NAME;
    }

    public void setBZ_ID(String BZ_ID) {
        this.BZ_ID = BZ_ID;
    }

    public void setCJ_NAME(String CJ_NAME) {
        this.CJ_NAME = CJ_NAME;
    }

    public void setCJ_ID(String CJ_ID) {
        this.CJ_ID = CJ_ID;
    }

    public String getCOUNT_IN_MONTH() {
        return COUNT_IN_MONTH;
    }

    public void setCOUNT_IN_MONTH(String COUNT_IN_MONTH) {
        this.COUNT_IN_MONTH = COUNT_IN_MONTH;
    }
}
