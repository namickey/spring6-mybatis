package com.example.demo.web.menu;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Item;
import com.example.demo.entity.ItemMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MenuController {

    private final ItemMapper itemMapper;

    @GetMapping("/")
    public String index(Model model) {

        System.out.println("MenuController.index() called.........");

        List<Item> list = itemMapper.selectAll();
        model.addAttribute("itemList", list);
        return "menu";
    }
}
