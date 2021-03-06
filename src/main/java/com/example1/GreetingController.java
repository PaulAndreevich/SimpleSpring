package com.example1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class GreetingController {

    @RequestMapping(value = "/")
    public String main(Map<String, Object> model){
        model.put("some", "Hello! Go code");
        return "main";
    }

    @RequestMapping(value = "/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
        model.put("name",name);
        return "greeting";
    }

}