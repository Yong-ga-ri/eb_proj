package com.varc.eb_proj.controller;

import com.varc.eb_proj.dto.MenuDTO;
import com.varc.eb_proj.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("health")
    public String health() {
        return "eb_proj is fine";
    }

    @GetMapping("menu/{menuCode}")
    public MenuDTO findMenu(@PathVariable("menuCode") int menuCode) {
        MenuDTO returnMenu = menuService.findMenuMyMenuCode(menuCode);
        return returnMenu;
    }

}