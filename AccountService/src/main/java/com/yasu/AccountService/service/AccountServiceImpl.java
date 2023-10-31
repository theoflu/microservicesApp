package com.yasu.AccountService.service;
import com.yasu.AccountService.entity.AccountEntity;
import com.yasu.AccountService.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{
    private final AccountRepository accountRepository;

    @Override
    public List<AccountEntity> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public AccountEntity save() {

        return null;
    }
}
