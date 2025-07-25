package com.example.demo.web.menu;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Item;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MenuController {

    private final ItemFindService itemFindService;

    @GetMapping("/")
    public String index(Model model) {

        List<Item> list = itemFindService.findAllItems();
        model.addAttribute("itemList", list);
        return "menu";
    }
}
