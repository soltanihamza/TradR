package com.tradR.tradR.restControllers.v1;

import com.tradR.api.domain.User;
import com.tradR.tradR.restDto.OwnerListDto;
import com.tradR.tradR.services.OwnerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/owners/")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("list/")
    public User getOwners(){
        System.out.println(new OwnerListDto(ownerService.getOwners()));
        User user = new User();
        user.setFirstName(ownerService.getOwners().get(0).getFirstName());
        return user;
        //return null;
    }


}
