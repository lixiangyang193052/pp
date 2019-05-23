package com.iotek.model;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/22
 * Time: 9:41
 * To change this template use File | Settings | File Templates.
 */
public class TAdmin implements Serializable {
    private Integer aId;
    private String aName;
    private String aPassword;
    private Long aPhone;

    public TAdmin() {
    }

    public TAdmin(String aName, String aPassword) {
        this.aName = aName;
        this.aPassword = aPassword;
    }

    public TAdmin(String aName, String aPassword, Long aPhone) {
        this.aName = aName;
        this.aPassword = aPassword;
        this.aPhone = aPhone;
    }

    public TAdmin(Integer aId, String aName, String aPassword, Long aPhone) {
        this.aId = aId;
        this.aName = aName;
        this.aPassword = aPassword;
        this.aPhone = aPhone;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

    public Long getaPhone() {
        return aPhone;
    }

    public void setaPhone(Long aPhone) {
        this.aPhone = aPhone;
    }

    @Override
    public String toString() {
        return "TAdmin{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aPassword='" + aPassword + '\'' +
                ", aPhone=" + aPhone +
                '}';
    }
}
