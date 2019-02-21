package com.tradR.tradR.services;

import com.tradR.tradR.models.Owner;
import com.tradR.tradR.repositories.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Iterable<Owner> getOwners() {
        return ownerRepository.findAll();
    }
}
