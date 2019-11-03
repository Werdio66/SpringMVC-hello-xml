package com._520.springMVC.hello;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("hello------");
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","Hello SpringMVC! ");
        mv.setViewName("WEB-INF/jsp.jsp");
        return mv;
    }
}
