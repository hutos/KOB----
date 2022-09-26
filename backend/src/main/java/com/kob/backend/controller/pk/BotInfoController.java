package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController // RestController是会返回数据，不会找模板
@RequestMapping("/pk")
public class BotInfoController {
    @RequestMapping("/getbotinfo")
    public Map<String,String> getBotInfo() {
        Map<String,String> mp = new HashMap<>();
        mp.put("sword","jzj");
        mp.put("tiger","www");
        mp.put("apple","hhh");
        return mp;
    }
}
