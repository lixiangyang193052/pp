package com.iotek.service.impl;

import com.iotek.dao.TDepMapper;
import com.iotek.model.TDep;
import com.iotek.service.DepService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/23
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */
@Service
public class DepServiceImpl implements DepService {
    @Resource
    private TDepMapper tDepMapper;

    public boolean addDEP(TDep tDep) {
        if (tDep!=null){
            return tDepMapper.addDEP(tDep);
        }
        return false;
    }

    public boolean delDEP(TDep tDep) {
        if (tDep!=null){
            return tDepMapper.delDEP(tDep);
        }
        return false;
    }

    public boolean upDEP(TDep tDep) {
        if (tDep!=null){
            return tDepMapper.upDEP(tDep);
        }
        return false;
    }

    public TDep getDEPByDid(Integer dId) {
        if (dId!=null){
            return tDepMapper.getDEPByDid(dId);
        }
        return null;
    }

    public List<TDep> getDeps() {
        return tDepMapper.getDeps();
    }
}
