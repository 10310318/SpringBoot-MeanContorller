package com.chtti.spring.demo.demo2Mean.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    @RequestMapping(method = RequestMethod.GET,value = "/product")
    public String list(@RequestParam(value = "p",required=false,defaultValue="iphone11") Model model){
        // return filename of the html inside resources/templates
        model.addAttribute("product_name","iphone");
        return "product_list";
    }

}
