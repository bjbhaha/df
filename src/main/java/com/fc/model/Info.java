package com.fc.model;

import java.util.Date;

public class Info {

    private String userName;
    private Integer iid;
    private String requestUrl;
    private String contextPath;
    private String remoteAddr;
    private Date access_time;

    public Info() {
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public Date getAccess_time() {
        return access_time;
    }

    public void setAccess_time(Date access_time) {
        this.access_time = access_time;
    }
    
    public void setUsername(String Username){
        this.Username = Username;
    }

    public String getUsername(){
       return this.username;   
    }
    @Override
    public String toString() {
        return "Info{" +
                "iid=" + iid +
                ", requestUrl='" + requestUrl + '\'' +
                ", contextPath='" + contextPath + '\'' +
                ", remoteAddr='" + remoteAddr + '\'' +
                ", access_time='" + access_time + '\'' +
                  " username='" + username + '\'' +
                '}';
    }
}
