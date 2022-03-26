package com.example.finale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class UseObject {
    @RequestMapping("student")
    public String senddata(Student stud)//you can take parameter named "name", using requestparam, and copy it to anything of your own local param name.
    {
        return "student.jsp";
    }

    @RequestMapping("use_object")
    public ModelAndView useobj(Student stud)//you can take parameter named "name", using requestparam, and copy it to anything of your own local param name.
    {
        //System.out.println(Myname);
        //session.setAttribute("name",Myname);, I dont want session to hold parameters
        //I can do it with, mv directly
        ModelAndView mv=new ModelAndView();
        mv.addObject("Student_Object",stud);
        mv.setViewName("displaystudent.jsp");//I can use MV to pass view and data, now you can acceses data using ${name} in view
        return mv;
    }
}
