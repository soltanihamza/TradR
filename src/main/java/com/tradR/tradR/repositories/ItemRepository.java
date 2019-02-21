package com.tradR.tradR.repositories;

import com.tradR.tradR.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository <Item,Long> {
}
