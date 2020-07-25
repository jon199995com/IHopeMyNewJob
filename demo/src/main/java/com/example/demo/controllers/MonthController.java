package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;

@Controller
public class MonthController {

    @GetMapping("/month")
    public String month(@RequestParam("numb") int numb, Model model) {
        HashMap<Integer, String> month = new HashMap<>();
        month.put(1, "Я-Н-В-А-Р-Ь");
        month.put(2, "Ф-Е-В-Р-А-Л-Ь");
        month.put(3, "М-А-Р-Т");
        month.put(4, "А-П-Р-Е-Л-ь");
        month.put(5, "М-А-Й");
        month.put(6, "И-Ю-Н-Ь");
        month.put(7, "И-Ю-Л-Ь");
        month.put(8, "А-В-Г-У-С-Т");
        month.put(9, "С-Е-Н-Т-Я-Б-Р-Ь");
        month.put(10, "О-К-Т-Я-Б-Р-Ь");
        month.put(11, "Н-О-Я-Б-Р-Ь");
        month.put(12, "Д-Е-К-А-Б-Р-Ь");
        String result ;
        if (numb>0&&numb<=12)
        result = month.get(numb);
        else result = "INCORRECT INPUT DATA";
        model.addAttribute("result", result);
        System.out.println();
        return "month";
    }
}
