package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.AccountDTO;
import com.example.SpaceBack.dto.AccountModifiedDTO;
import com.example.SpaceBack.dto.AccountShortDTO;
import com.example.SpaceBack.dto.LoginDTO;

public interface AccountService {
    AccountDTO createAccount(AccountDTO accountToCreate);
    AccountDTO getAccountByUsername(AccountShortDTO accountToFound);
    AccountDTO updateAccount(AccountModifiedDTO accountToUpdate);
    AccountDTO deleteAccount(AccountDTO accountToDelete);

    AccountShortDTO login(LoginDTO loginDTO);
}