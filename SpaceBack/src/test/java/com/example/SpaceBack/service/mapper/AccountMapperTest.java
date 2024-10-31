package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.AccountDTO;
import com.example.SpaceBack.dto.AccountShortDTO;
import com.example.SpaceBack.model.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AccountMapperTest {

    LocalDateTime createdAt;
    Account account;

    @BeforeEach
    public void setUp() {
        createdAt = LocalDateTime.now();
        account = Account.builder()
                .id(UUID.randomUUID())
                .username("toto")
                .email("toto@gmail.com")
                .password("password")
                .createdAt(createdAt)
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
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void account_Should_Map_To_AccountDTO() {
        // given
        AccountDTO expected = new AccountDTO("toto", "toto@gmail.com", "url", createdAt);

        // when
        AccountDTO result = AccountMapper.INSTANCE_ACCOUNT.accountToAccountDTO(account);

        // then
        assertThat(result).isEqualTo(expected);
    }
}
