package com.example.demo.controllers;

import com.example.demo.entity.Article;
import com.example.demo.textComparator.TextComparator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;

@Controller
public class ArticleController {

    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public String articleForm(Model model) {
        model.addAttribute("article", new Article());
        return "article";
    }

    @RequestMapping(value = "/article", method = RequestMethod.POST)
    public String textController(@ModelAttribute Article text, Model model) {
        LinkedList<String> list = new LinkedList<>();
        for (String str : text.getContent().split("\n")) {
            list.add(str);
        }
        list.sort(new TextComparator());
        for (String str : list) {
            list.set(list.indexOf(str), "(" + str.length() + "): " + str);
        }
        text.setContent(list.toString());
        for (int i = 0; i < text.getContent().split("\n").length; i++) {
            System.out.println(list.get(i));
        }
        return "article";
    }

}