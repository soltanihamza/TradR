package com.tradR.tradR.mapper;

import com.tradR.tradR.models.Owner;
import com.tradR.tradR.restDto.OwnerDto;
import org.mapstruct.MapperConfig;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;


@Component
public class OwnerMapperImpl implements OwnerMapper {
    @Override
    public OwnerDto OwnerToOwnerDto(Owner owner) {
        if (owner == null) {
            return null;
        }

        OwnerDto ownerDto = new OwnerDto();

        ownerDto.setFirstName(owner.getFirstName());
        ownerDto.setLastName(owner.getLastName());
        return ownerDto;
    }
}
