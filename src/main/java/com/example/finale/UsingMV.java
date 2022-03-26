package com.example.finale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
@Controller
public class UsingMV {
    @RequestMapping("mv")
    public ModelAndView success2(@RequestParam("name") String Myname)//you can take parameter named "name", using requestparam, and copy it to anything of your own local param name.
    {
        System.out.println(Myname);
        //session.setAttribute("name",Myname);, I dont want session to hold parameters
        //I can do it with, mv directly
        ModelAndView mv=new ModelAndView();
        mv.addObject("name",Myname);
        mv.setViewName("success.jsp");//I can use MV to pass view and data, now you can acceses data using ${name} in view
        return mv;
    }
}
