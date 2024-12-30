package com.multiple.db.service;

import com.multiple.db.postgres.entity.Address;

public interface AddressService {

    Address saveAddress(Address address);
}
