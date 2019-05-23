package com.iotek.service.impl;

import com.iotek.dao.TAdminMapper;
import com.iotek.model.TAdmin;
import com.iotek.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/22
 * Time: 9:57
 * To change this template use File | Settings | File Templates.
 */

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private TAdminMapper tAdminMapper;
    public TAdmin login(TAdmin tAdmin) {
        return tAdminMapper.getAdmin(tAdmin);
    }

}
