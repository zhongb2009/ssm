package com.zyh.service;

import com.zyh.domain.Account;

import java.util.List;

/**
 * 账户service接口
 */

public interface AccountService {

    // 查询所有账户
    public List<Account> findAll();

    // 保存账户信息
    public void saveAccount(Account account);

}
