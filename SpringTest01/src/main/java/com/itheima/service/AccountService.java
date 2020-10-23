package com.itheima.service;

import com.itheima.bean.Account;

import java.sql.SQLException;
import java.util.List;

public interface AccountService {
    List<Account> findAll() throws SQLException;
}
