package com.tradR.tradR.bootstrap;

import com.tradR.tradR.models.Item;
import com.tradR.tradR.models.Owner;
import com.tradR.tradR.repositories.ItemRepository;
import com.tradR.tradR.repositories.OwnerRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private OwnerRepository ownerRepository;
    private ItemRepository itemRepository;

    public DevBootstrap(OwnerRepository ownerRepository, ItemRepository itemRepository) {
        this.ownerRepository = ownerRepository;
        this.itemRepository = itemRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Owner admin = new Owner("hamza","soltani","soltanixhamza@gmail.com","admin");
        Item phone = new Item("condor p8","mobile phone");
        admin.getItems().add(phone);
        itemRepository.save(phone);
        ownerRepository.save(admin);
        phone.setOwner(admin);
        itemRepository.save(phone);
    }
}
