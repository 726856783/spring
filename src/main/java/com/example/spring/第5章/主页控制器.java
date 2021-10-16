package com.example.spring.第5章;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/")
//@RequestMapping({"/","主页"})
public class 主页控制器 {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String 主页() {
        return "主页";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String 主页2() {
        return "主页";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String 查询(Model model) {
        model.addAttribute(new Object());
        model.addAttribute("", new Object());
        return "主页";
    }

    @RequestMapping(value = "/{param2}", method = RequestMethod.GET)
    public List<Object> 查询2(@RequestParam(value = "param", defaultValue = "100") int param,
                            @PathVariable("param2") int param2) {
        return new ArrayList<>();
    }

    @RequestMapping(value = "/验证", method = RequestMethod.GET)
    public String 验证(@Validated Object object, Errors errors) {
        if (errors.hasErrors()) {

        }
        return "";
    }
}
