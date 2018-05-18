package com.example.immutable;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SampleController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("sampleForm", new SampleForm(null, null));
        return "index";
    }

    @PostMapping("/add")
    public String add(@Validated SampleForm sampleForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        return "result";
    }
}
