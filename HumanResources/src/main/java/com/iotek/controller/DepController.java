package com.iotek.controller;

import com.iotek.model.TDep;
import com.iotek.model.TJob;
import com.iotek.service.DepService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

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
        TDep dep = deps.get(0);
        Set<TJob> tJobs = dep.gettJobs();
        session.setAttribute("Deps",deps);
        session.setAttribute("Jobs",tJobs);
        return "Depmanage";
    }

    @RequestMapping("ganged")//联动
    @ResponseBody
    public Set<TJob> ganged( HttpServletResponse response, HttpServletRequest request, HttpSession session)throws Exception{

        String did1 = request.getParameter("did");
        Integer did = Integer.parseInt(did1);
        //选中的部门
        TDep dep = depService.getDEPByDid(did);
        //部门下的职位
        Set<TJob> tJobs = dep.gettJobs();

        return tJobs;


    }

}
