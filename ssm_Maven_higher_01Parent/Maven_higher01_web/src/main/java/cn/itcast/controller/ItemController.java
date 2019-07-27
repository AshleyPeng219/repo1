package cn.itcast.controller;

import cn.itcast.domain.Item;
import cn.itcast.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    @Qualifier("itemService")
    private ItemService itemService;

    @RequestMapping("/findOneById")
    public String findOneById(Model model){
        Item one = itemService.findOneById(1);
        model.addAttribute("item",one);
        return "itemDetail";
    }
}
