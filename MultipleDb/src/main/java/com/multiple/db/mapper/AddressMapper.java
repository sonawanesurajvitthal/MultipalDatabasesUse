package com.multiple.db.mapper;

import com.multiple.db.domain.request.AddressRequestDto;
import com.multiple.db.domain.response.AddressResponseDto;
import com.multiple.db.postgres.entity.Address;

public class AddressMapper {

    public Address getAddress(AddressRequestDto addressRequestDto){
        Address address = new Address();
        address.setLine1(addressRequestDto.getLine1());
        address.setCity(addressRequestDto.getCity());
        address.setId(address.getId());
        return address;
    }

    public AddressResponseDto getResponse(Address address){
        AddressResponseDto addressResponseDto = new AddressResponseDto();
        addressResponseDto.setCity(address.getCity());
        addressResponseDto.setId(address.getId());
        addressResponseDto.setLine1(address.getLine1());
        return addressResponseDto;
    }
}
