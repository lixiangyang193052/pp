package com.iotek.controller;

import com.iotek.model.TDep;
import com.iotek.service.DepService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/23
 * Time: 13:42
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class DepController {

    @Resource
    private DepService depService;

    @RequestMapping("toDepmanagePage")
    public String toDepmanagePage(Model model, HttpServletResponse response, HttpServletRequest request, HttpSession session)throws Exception{
        //得到全部的部门
        List<TDep> deps = depService.getDeps();
        session.setAttribute("Deps",deps);
        return "Depmanage";
    }

}
