package com.varc.eb_proj.service;

import com.varc.eb_proj.dto.MenuDTO;
import com.varc.eb_proj.entity.Menu;
import com.varc.eb_proj.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    private final ModelMapper modelMapper;
    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(
            ModelMapper modelMapper,
            MenuRepository menuRepository
    ) {
        this.modelMapper = modelMapper;
        this.menuRepository = menuRepository;
    }

    public MenuDTO findMenuMyMenuCode(int menuCode) {
        Menu menu = menuRepository.findById(menuCode).orElseThrow();

        return modelMapper.map(menu, MenuDTO.class);
    }
}
