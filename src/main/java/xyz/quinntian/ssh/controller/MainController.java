package xyz.quinntian.ssh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
//        ʵ�ʷ��ص���views/test.jsp ,spring-mvc.xml�����ù�ǰ��׺
        return "test";
    }
}