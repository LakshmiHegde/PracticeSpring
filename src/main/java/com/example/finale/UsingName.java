package com.example.finale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
//to find demo, localhost:9012/success?name=lakshmi
@Controller
public class UsingName {
    @RequestMapping("success")
    public String success(String name, HttpSession session) //expects parameter passed to have same name, as "name" and not anything else
    {
        System.out.println(name);
        session.setAttribute("name",name);
        return "success.jsp";
    }
    @RequestMapping("success2")
    public String success2(@RequestParam("name") String Myname, HttpSession session)//you can take parameter named "name", using requestparam, and copy it to anything of your own local param name.
    {
        System.out.println(Myname);
        session.setAttribute("name",Myname);
        return "success.jsp";
    }

}
