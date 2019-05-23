package com.iotek.dao;

import com.iotek.model.TDep;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/22
 * Time: 16:45
 * To change this template use File | Settings | File Templates.
 */
public interface TDepMapper {
    boolean addDEP(TDep tDep);
    boolean delDEP(TDep tDep);
    boolean upDEP(TDep tDep);
    TDep getDEPByDid(Integer dId);
    List<TDep> getDeps();
}
