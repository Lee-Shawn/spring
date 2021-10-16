package com.laughing.spring.controller;

import com.laughing.spring.entity.MyThymeleaf;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : laughing
 * @create : 2021-10-16 18:41
 * @description :
 */
@Controller
public class ThymeleafController {
    @GetMapping("/thymeleaf")
    public ModelAndView thymeleaf() {
        List<MyThymeleaf> thymeleafList = new ArrayList<>();
        MyThymeleaf thymeleaf = new MyThymeleaf();
        thymeleaf.setId(1);
        thymeleaf.setName("thymeleaf");
        thymeleafList.add(thymeleaf);
        MyThymeleaf freeMarker = new MyThymeleaf();
        freeMarker.setId(2);
        freeMarker.setName("FreeMarker");
        thymeleafList.add(freeMarker);
        ModelAndView mv = new ModelAndView();
        mv.addObject("engine", thymeleafList);
        mv.setViewName("thymeleaf");
        return mv;
    }
}
