package com.iotek.model;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/22
 * Time: 16:29
 * To change this template use File | Settings | File Templates.
 */
public class TJob {
    private Integer jId;

    private TDep tDep; //部门
//    private Integer jDid; //部门id

    private String jName;
    private Date jTime;

    public TJob() {
    }

    public TJob(TDep tDep, String jName, Date jTime) {
        this.tDep = tDep;
        this.jName = jName;
        this.jTime = jTime;
    }

    public TJob(Integer jId, TDep tDep, String jName, Date jTime) {
        this.jId = jId;
        this.tDep = tDep;
        this.jName = jName;
        this.jTime = jTime;
    }

    public Integer getjId() {
        return jId;
    }

    public void setjId(Integer jId) {
        this.jId = jId;
    }

    public TDep gettDep() {
        return tDep;
    }

    public void settDep(TDep tDep) {
        this.tDep = tDep;
    }

    public String getjName() {
        return jName;
    }

    public void setjName(String jName) {
        this.jName = jName;
    }

    public Date getjTime() {
        return jTime;
    }

    public void setjTime(Date jTime) {
        this.jTime = jTime;
    }

    @Override
    public String toString() {
        return "TJob{" +
                "jId=" + jId +
                ", tDep=" + tDep +
                ", jName='" + jName + '\'' +
                ", jTime=" + jTime +
                '}';
    }
}
