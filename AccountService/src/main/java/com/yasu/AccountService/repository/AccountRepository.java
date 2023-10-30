package com.yasu.AccountService.repository;

import com.yasu.AccountService.entity.AccountEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


public interface AccountRepository extends CassandraRepository<AccountEntity,String> {
}
