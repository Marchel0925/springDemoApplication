package com.example.demo.th;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HalloController {

    @GetMapping("/hallo")
    public String sayHallo(final ModelMap modelMap){
        modelMap.addAttribute("text", "Hallo World from programming");
        return "welcome"; // resources/templates/welcome.html -> path to html
    }
}
