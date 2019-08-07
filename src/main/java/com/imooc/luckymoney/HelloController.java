package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.math.BigDecimal;
//@Controller + @ResponseBody = @RestController
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LimitCongfig limitCongfig;

//    @GetMapping("/say")
    @PostMapping("/say")
//    @RequestMapping("say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
//        return "说明: " + limitCongfig.getDescription();
//        return "index";
        return "id: "  + id;
    }
}
