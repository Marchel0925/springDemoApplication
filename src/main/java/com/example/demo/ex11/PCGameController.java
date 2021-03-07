package com.example.demo.ex11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pc-games")
public class PCGameController {

    @GetMapping
    public String showPcGameForm(final ModelMap modelMap) {
        modelMap.addAttribute("createMessage", "Create PC Game");
        modelMap.addAttribute("pcGameForm", new PCGameForm());
        return "pcgame";
    }

    @PostMapping
    public String handlePcGameForm(@ModelAttribute("pcGameForm") final PCGameForm form, final ModelMap modelMap) {
        modelMap.addAttribute("pcGame", form);
        return "pcgame_info";
    }
}
