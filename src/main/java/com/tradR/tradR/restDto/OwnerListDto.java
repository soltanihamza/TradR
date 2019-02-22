package com.tradR.tradR.restDto;

import java.util.List;


public class OwnerListDto {

    List<OwnerDto> ownerDtoList;

    public OwnerListDto(List<OwnerDto> ownerDtoList) {
        this.ownerDtoList = ownerDtoList;
    }
}
