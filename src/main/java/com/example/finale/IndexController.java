package com.example.finale;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class IndexController {
    @RequestMapping("/")//first page to display
    public String home(HttpServletRequest req)//in servlet, for each meth if you need /not you specified both req, res objects as parameters. here its optional you can use either two or one or none.
    {
        /*System.out.println("enteres");
        HttpSession session=req.getSession();//take a hold on session
        String field1=session.getAttribute("f1").toString();
        String field2=session.getAttribute("f2").toString();
        session.setAttribute("First_name",field1);//save data from client into attributes. so that you can access in the page.
        session.setAttribute("Last_name",field2);*/
        return "home.jsp";
    }


}
