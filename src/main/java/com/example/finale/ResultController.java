package com.example.finale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

@Controller
public class ResultController {
    @RequestMapping("display")
    public String display(HttpServletRequest req)//in servlet, for each meth if you need /not you specified both req, res objects as parameters. here its optional you can use either two or one or none.
    {
        //System.out.println("enteres");
        HttpSession session=req.getSession();//take a hold on session
        String field1=req.getParameter("f1");
        String field2=req.getParameter("f2");//to get parameters passed we can get it using request.
        session.setAttribute("First_name",field1);//save data from client into attributes. so that you can access in the page.
        session.setAttribute("Last_name",field2);
        System.out.println(field1+" "+field2);
        return "display.jsp";
    }
}
