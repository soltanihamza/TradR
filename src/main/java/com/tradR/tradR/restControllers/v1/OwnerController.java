package com.tradR.tradR.restControllers.v1;

import com.tradR.api.domain.User;
import com.tradR.tradR.services.OwnerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/owners/")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping
    public ResponseEntity<Iterable<User>> getAllOwners(){
        return new ResponseEntity<Iterable<User>>(ownerService.getOwners(), HttpStatus.OK);
    }
}
