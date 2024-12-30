package com.multiple.db.controller;

import com.multiple.db.postgres.entity.Address;
import com.multiple.db.service.AddressService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @PostMapping
    public Address saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

}
