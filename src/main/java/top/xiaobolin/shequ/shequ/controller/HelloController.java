package top.xiaobolin.shequ.shequ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author：xiaobolin
 * @date 2020/7/7/0007 - 16:52
 */

@Controller
public class HelloController {

    @GetMapping("/hello")
    public void hello(@RequestParam(name="name") String name, Model model){


    }
}
