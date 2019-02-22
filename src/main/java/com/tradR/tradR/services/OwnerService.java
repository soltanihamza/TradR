package com.tradR.tradR.services;

import com.tradR.tradR.models.Owner;
import com.tradR.tradR.restDto.OwnerDto;

import java.util.List;

public interface OwnerService {

    List<OwnerDto> getOwners();
}
