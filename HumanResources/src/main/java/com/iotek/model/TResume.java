package com.iotek.model;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/23
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 */
public class TResume {
    private Integer rsId;
    private TUser tUser;
    private String rsAbility;
    private String rsName;
    private String rsSex;
    private Long rsPhone;
    private String rsIntroduce;
    private String rsLocation;
    private String rsEducation;

    public TResume() {
    }

    public TResume(TUser tUser, String rsAbility, String rsName, String rsSex, Long rsPhone, String rsIntroduce, String rsLocation, String rsEducation) {
        this.tUser = tUser;
        this.rsAbility = rsAbility;
        this.rsName = rsName;
        this.rsSex = rsSex;
        this.rsPhone = rsPhone;
        this.rsIntroduce = rsIntroduce;
        this.rsLocation = rsLocation;
        this.rsEducation = rsEducation;
    }

    public TResume(Integer rsId, TUser tUser, String rsAbility, String rsName, String rsSex, Long rsPhone, String rsIntroduce, String rsLocation, String rsEducation) {
        this.rsId = rsId;
        this.tUser = tUser;
        this.rsAbility = rsAbility;
        this.rsName = rsName;
        this.rsSex = rsSex;
        this.rsPhone = rsPhone;
        this.rsIntroduce = rsIntroduce;
        this.rsLocation = rsLocation;
        this.rsEducation = rsEducation;
    }

    public Integer getRsId() {
        return rsId;
    }

    public void setRsId(Integer rsId) {
        this.rsId = rsId;
    }

    public TUser gettUser() {
        return tUser;
    }

    public void settUser(TUser tUser) {
        this.tUser = tUser;
    }

    public String getRsAbility() {
        return rsAbility;
    }

    public void setRsAbility(String rsAbility) {
        this.rsAbility = rsAbility;
    }

    public String getRsName() {
        return rsName;
    }

    public void setRsName(String rsName) {
        this.rsName = rsName;
    }

    public String getRsSex() {
        return rsSex;
    }

    public void setRsSex(String rsSex) {
        this.rsSex = rsSex;
    }

    public Long getRsPhone() {
        return rsPhone;
    }

    public void setRsPhone(Long rsPhone) {
        this.rsPhone = rsPhone;
    }

    public String getRsIntroduce() {
        return rsIntroduce;
    }

    public void setRsIntroduce(String rsIntroduce) {
        this.rsIntroduce = rsIntroduce;
    }

    public String getRsLocation() {
        return rsLocation;
    }

    public void setRsLocation(String rsLocation) {
        this.rsLocation = rsLocation;
    }

    public String getRsEducation() {
        return rsEducation;
    }

    public void setRsEducation(String rsEducation) {
        this.rsEducation = rsEducation;
    }

    @Override
    public String toString() {
        return "TResume{" +
                "rsId=" + rsId +
                ", tUser=" + tUser +
                ", rsAbility='" + rsAbility + '\'' +
                ", rsName='" + rsName + '\'' +
                ", rsSex='" + rsSex + '\'' +
                ", rsPhone=" + rsPhone +
                ", rsIntroduce='" + rsIntroduce + '\'' +
                ", rsLocation='" + rsLocation + '\'' +
                ", rsEducation='" + rsEducation + '\'' +
                '}';
    }
}
