package com.cuisea.redis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Thymeleaf初探
 *
 * @author cuisea
 * @date 2017/11/21 下午12:49
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/hello")
    public String hello(Locale locale, Model model) {
        model.addAttribute("greeting", "Hello!");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("currentTime", formattedDate);

        List list = new ArrayList();
        list.add("bb");
        list.add("aa");
        list.add("dd");
        list.add("cc");
        model.addAttribute("collects", list);

        return "hello";
    }
}
