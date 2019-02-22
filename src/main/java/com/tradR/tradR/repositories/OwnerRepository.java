package com.tradR.tradR.repositories;

import com.tradR.tradR.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends JpaRepository <Owner,Long>{
}
