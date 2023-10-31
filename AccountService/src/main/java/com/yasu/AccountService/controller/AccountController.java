package com.yasu.AccountService.controller;

import com.yasu.AccountService.entity.AccountEntity;
import com.yasu.AccountService.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.bouncycastle.asn1.ocsp.ResponderID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("account")
public class AccountController {
    private final AccountService accountService;
    @GetMapping
    ResponseEntity<List<AccountEntity>> getAll(){
        return ResponseEntity.ok(accountService.getAll());
    }
    @GetMapping("save")
    ResponseEntity<?> save(){
        return ResponseEntity.ok(accountService.save());
    }
}
