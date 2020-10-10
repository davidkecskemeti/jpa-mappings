package com.dk.jpa.mappings.one2one.repository;

import com.dk.jpa.mappings.one2one.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
