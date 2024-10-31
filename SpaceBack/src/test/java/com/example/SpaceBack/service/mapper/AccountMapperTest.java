package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.AccountDTO;
import com.example.SpaceBack.dto.AccountShortDTO;
import com.example.SpaceBack.model.Account;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountMapperTest {

    Account account;

    @BeforeEach
    public void setUp() {
        account = Account.builder()
                .id(UUID.randomUUID())
                .username("toto")
                .email("toto@email.com")
                .password("password")
                .createdAt(LocalDate.now())
                .avatarUrl("url")
                .build();
    }

    @Test
    public void account_Should_Map_To_AccountShortDto() {
        // given
        AccountShortDTO expected = new AccountShortDTO("toto", "url");

        // when
        AccountShortDTO result = AccountMapper.INSTANCE_ACCOUNT.accountToAccountShortDTO(account);

        // then
        assertEquals(expected, result);
    }

    @Test
    public void account_Should_Map_To_AccountDTO() {
        // given
        AccountDTO expected = new AccountDTO("tata", "toto@gmail.com", "url", LocalDateTime.now());
    }
}