package com.jzwx.spring.boot.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * BlogController 博客控制器类
 *
 * @author jzwx
 * @version $ Id: MainController, v 0.1 2018/2/12 13:01 jzwx Exp $
 */
@Controller
@RequestMapping("/blogs")
public class BlogController {

    @GetMapping
    public String listBlogs(@RequestParam(value = "order", required = false, defaultValue = "new") String order,
                            @RequestParam(value = "keyword", required = false,defaultValue = "") Long keyword) {
        System.out.println("order:"+order+";tag:"+keyword);
        return "redirect:/index?order="+order+"&tag="+keyword;
    }
}
