package com.iotek.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/22
 * Time: 16:25
 * To change this template use File | Settings | File Templates.
 */

public class TDep {
    private Integer dId;
    private String dName;
    private Date dTime;
    private Set<TJob> tJobs = new HashSet<TJob>();

    public TDep() {
    }

    public TDep(String dName, Date dTime) {
        this.dName = dName;
        this.dTime = dTime;
    }

    public TDep(Integer dId, String dName, Date dTime) {
        this.dId = dId;
        this.dName = dName;
        this.dTime = dTime;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Date getdTime() {
        return dTime;
    }

    public void setdTime(Date dTime) {
        this.dTime = dTime;
    }

    public Set<TJob> gettJobs() {
        return tJobs;
    }

    public void settJobs(Set<TJob> tJobs) {
        this.tJobs = tJobs;
    }

    @Override
    public String toString() {
        return "TDep{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", dTime=" + dTime +
                ", tJobs=" + tJobs +
                '}';
    }
}
