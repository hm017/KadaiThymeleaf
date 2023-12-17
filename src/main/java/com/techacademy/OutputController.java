package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("val") String val, Model model) {
        //modelにいれる
        model.addAttribute("val", val); //入力した値
        model.addAttribute("previous", val); //クエリパラメータ(入力値)
        return "output";
    }
}