package com.iotek.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/23
 * Time: 10:04
 * To change this template use File | Settings | File Templates.
 */
public class TUser {
    private Integer uId;
    private  String uName;
    private String uPass;

    private TResume tResume ;

    public TUser() {
    }

    public TUser(String uName, String uPass, TResume tResume) {
        this.uName = uName;
        this.uPass = uPass;
        this.tResume = tResume;
    }

    public TUser(String uName, String uPass) {
        this.uName = uName;
        this.uPass = uPass;
    }

    public TUser(Integer uId, String uName, String uPass) {
        this.uId = uId;
        this.uName = uName;
        this.uPass = uPass;
    }

    public TUser(Integer uId, String uName, String uPass, TResume tResume) {
        this.uId = uId;
        this.uName = uName;
        this.uPass = uPass;
        this.tResume = tResume;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    public TResume gettResume() {
        return tResume;
    }

    public void settResume(TResume tResume) {
        this.tResume = tResume;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPass='" + uPass + '\'' +
                ", tResume=" + tResume +
                '}';
    }
}
