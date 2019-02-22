package com.tradR.tradR.mapper;


import com.tradR.tradR.models.Owner;
import com.tradR.tradR.restDto.OwnerDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OwnerMapper {

    OwnerMapper Instance = Mappers.getMapper(OwnerMapper.class);
    @Mapping(source= "password",target = "password")
    OwnerDto OwnerToOwnerDto(Owner owner);
}
