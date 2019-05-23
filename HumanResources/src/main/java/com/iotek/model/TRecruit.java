package com.iotek.model;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/23
 * Time: 13:06
 * To change this template use File | Settings | File Templates.
 */
public class TRecruit {
    private Integer rId;
    private TDep tDep;
    private TJob tJob;
    private String rSite;
    private Double rSal;
    private String rDesc;
    private Date rTime;

    public TRecruit() {
    }

    public TRecruit(TDep tDep, TJob tJob, String rSite, Double rSal, String rDesc, Date rTime) {
        this.tDep = tDep;
        this.tJob = tJob;
        this.rSite = rSite;
        this.rSal = rSal;
        this.rDesc = rDesc;
        this.rTime = rTime;
    }

    public TRecruit(Integer rId, TDep tDep, TJob tJob, String rSite, Double rSal, String rDesc, Date rTime) {
        this.rId = rId;
        this.tDep = tDep;
        this.tJob = tJob;
        this.rSite = rSite;
        this.rSal = rSal;
        this.rDesc = rDesc;
        this.rTime = rTime;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public TDep gettDep() {
        return tDep;
    }

    public void settDep(TDep tDep) {
        this.tDep = tDep;
    }

    public TJob gettJob() {
        return tJob;
    }

    public void settJob(TJob tJob) {
        this.tJob = tJob;
    }

    public String getrSite() {
        return rSite;
    }

    public void setrSite(String rSite) {
        this.rSite = rSite;
    }

    public Double getrSal() {
        return rSal;
    }

    public void setrSal(Double rSal) {
        this.rSal = rSal;
    }

    public String getrDesc() {
        return rDesc;
    }

    public void setrDesc(String rDesc) {
        this.rDesc = rDesc;
    }

    public Date getrTime() {
        return rTime;
    }

    public void setrTime(Date rTime) {
        this.rTime = rTime;
    }

    @Override
    public String toString() {
        return "TRecruit{" +
                "rId=" + rId +
                ", tDep=" + tDep +
                ", tJob=" + tJob +
                ", rSite='" + rSite + '\'' +
                ", rSal=" + rSal +
                ", rDesc='" + rDesc + '\'' +
                ", rTime=" + rTime +
                '}';
    }
}
