package com.yasu.AccountService.service;
import com.yasu.AccountService.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl {
    private final AccountRepository accountRepository;
}
