package com.iotek.controller;

import com.iotek.model.TAdmin;
import com.iotek.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/22
 * Time: 10:00
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping("adminLogin")
    public String login( TAdmin tAdmin,Model model, HttpServletResponse response, HttpServletRequest request,HttpSession session)throws ServletException, IOException {
        TAdmin admin = adminService.login(tAdmin);
        if (admin!=null){
            session.setAttribute("a",admin);
            return "AdSuccess";
        }else {
            model.addAttribute("a","账号或密码错误！");
            return "adminMain";
//            response.getWriter().print("账号或密码错误！2秒后返回...");
//            response.setHeader("refresh", "2;url=toAdminLoginPage");
//            return "AdminLogin";
        }
    }
    @RequestMapping("toAdminLoginPage")
    public String toLoginPage()throws Exception{
        return "AdminLogin";
    }
}
