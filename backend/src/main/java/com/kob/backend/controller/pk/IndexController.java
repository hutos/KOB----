package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//Controller 返回字符串会在resource里面找模板
@RequestMapping("/pk")
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "pk/index.html";
    }
}
