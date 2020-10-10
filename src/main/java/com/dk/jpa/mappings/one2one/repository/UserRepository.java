package com.dk.jpa.mappings.one2one.repository;

import com.dk.jpa.mappings.one2one.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
