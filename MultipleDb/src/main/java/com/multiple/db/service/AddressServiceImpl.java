package com.multiple.db.service;

import com.multiple.db.postgres.entity.Address;
import com.multiple.db.postgres.repo.AddressRepositoryPostgres;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{

    private final AddressRepositoryPostgres repositoryPostgres;

    public AddressServiceImpl(AddressRepositoryPostgres repositoryPostgres){
        this.repositoryPostgres = repositoryPostgres;
    }


    @Override
    public Address saveAddress(Address address) {
        return repositoryPostgres.save(address);
    }
}
