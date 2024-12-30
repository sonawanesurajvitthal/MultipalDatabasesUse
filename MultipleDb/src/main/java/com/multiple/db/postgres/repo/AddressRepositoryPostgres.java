package com.multiple.db.postgres.repo;

import com.multiple.db.postgres.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepositoryPostgres extends JpaRepository<Address, Integer> {
}
