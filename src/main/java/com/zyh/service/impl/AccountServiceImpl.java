package com.zyh.service.impl;

import com.zyh.dao.AccountDao;
import com.zyh.domain.Account;
import com.zyh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    // 查找所有账户
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查找所有账户");
        return accountDao.findAll();
    }

    // 保存账户信息
    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户信息");
        accountDao.saveAccount(account);
    }
}
