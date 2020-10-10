package com.dk.jpa.mappings.composite.repository;

import com.dk.jpa.mappings.composite.entity.Account;
import com.dk.jpa.mappings.composite.entity.AccountId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, AccountId> {

    List<Account> findByAccountType(String accountType);
}
