package com.yasu.AccountService.service;

import com.yasu.AccountService.entity.AccountEntity;
import com.yasu.AccountService.repository.AccountRepository;

import java.util.List;

public interface AccountService {
    List<AccountEntity> getAll();
    AccountEntity save();

}
