package top.xiaobolin.shequ.shequ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletRequest;

/**
 * @author：xiaobolin
 * @date 2020/7/7/0007 - 16:52
 */

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name="name") String name, ServletRequest ServletRequest){
        ServletRequest.setAttribute("name",name);
        System.out.println("aaaaa");
        return "Hello";
    }
    @GetMapping("/hello2")
    public String hello2(@RequestParam(name="name") String name, ServletRequest ServletRequest){
        ServletRequest.setAttribute("name",name);
        System.out.println("aaaaa");
        return "Hello";
    }
}
