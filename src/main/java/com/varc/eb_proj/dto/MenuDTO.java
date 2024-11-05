package com.varc.eb_proj.dto;

import lombok.Data;

@Data
public class MenuDTO {
    private String menuCode;
    private String menuName;
    private String menuPrice;
    private String categoryCode;
    private String orderableStatus;
}
