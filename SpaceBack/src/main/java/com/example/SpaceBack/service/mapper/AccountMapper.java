package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.AccountCreatedDTO;
import com.example.SpaceBack.dto.AccountDTO;
import com.example.SpaceBack.dto.AccountModifiedDTO;
import com.example.SpaceBack.dto.AccountShortDTO;
import com.example.SpaceBack.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {

    AccountMapper INSTANCE_ACCOUNT = Mappers.getMapper(AccountMapper.class);

    // AccountShortDTO
    AccountShortDTO accountToAccountShortDTO(Account account);

    // AccountDTO
    AccountDTO accountToAccountDTO(Account account);

    // AccountCreatedDTO
    Account accountCreatedDTOToAccount(AccountCreatedDTO accountCreatedDTO);
}
