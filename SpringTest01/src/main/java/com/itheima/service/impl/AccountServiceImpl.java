package com.itheima.service.impl;

import com.itheima.bean.Account;
import com.itheima.dao.AccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service("service")
public class AccountServiceImpl implements AccountService {

    private AccountDaoImpl accountDaoImpl;

    @Autowired
    public AccountServiceImpl(AccountDaoImpl accountDaoImpl) {
        this.accountDaoImpl = accountDaoImpl;
    }

    @Override
    public List<Account> findAll() throws SQLException {
        return accountDaoImpl.findAll();
    }
}
