package com.itheima.dao.impl;

import com.itheima.bean.Account;
import com.itheima.dao.AccountDao;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class AccountDaoImplA implements AccountDao {
    @Override
    public List<Account> findAll() throws SQLException {
        return null;
    }
}
