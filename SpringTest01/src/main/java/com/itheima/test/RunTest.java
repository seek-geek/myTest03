package com.itheima.test;

import com.itheima.bean.Account;
import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class RunTest {

    public static AccountServiceImpl service;

    @Autowired
    public void setService(AccountServiceImpl service) {
        RunTest.service = service;
    }

    public static void main(String[] args) {
        try {
//            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//            AccountService service = (AccountService) applicationContext.getBean("service");
            List<Account> all = service.findAll();
            for (Account account : all) {
                System.out.println(account.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
