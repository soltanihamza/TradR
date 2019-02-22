package com.tradR.tradR.services;

import com.tradR.tradR.mapper.OwnerMapper;
import com.tradR.tradR.models.Owner;
import com.tradR.tradR.repositories.OwnerRepository;
import com.tradR.tradR.restDto.OwnerDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final OwnerMapper ownerMapper;

    public OwnerServiceImpl(OwnerRepository ownerRepository, OwnerMapper ownerMapper) {
        this.ownerRepository = ownerRepository;
        this.ownerMapper = ownerMapper;
    }

    @Override
    public List<OwnerDto> getOwners() {
        return ownerRepository.findAll()
                .stream()
                .map(ownerMapper::OwnerToOwnerDto)
                .collect(Collectors.toList());
    }
}
