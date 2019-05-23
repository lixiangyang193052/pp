package com.iotek.service;

import com.iotek.model.TDep;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/23
 * Time: 13:43
 * To change this template use File | Settings | File Templates.
 */
public interface DepService {
    boolean addDEP(TDep tDep);
    boolean delDEP(TDep tDep);
    boolean upDEP(TDep tDep);
    TDep getDEPByDid(Integer dId);
    List<TDep> getDeps();
}
