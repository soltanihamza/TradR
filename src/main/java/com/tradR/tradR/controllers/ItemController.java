package com.tradR.tradR.controllers;

import com.tradR.tradR.repositories.ItemRepository;
import com.tradR.tradR.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping({"/",""})
    public String getItems(Model model){
        model.addAttribute("items",itemService.getItems());
        return "items";
    }
}
