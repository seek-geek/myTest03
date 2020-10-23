package com.itheima.dao;

import com.itheima.bean.Account;

import java.sql.SQLException;
import java.util.List;

public interface AccountDao {
    List<Account> findAll() throws SQLException;
}
