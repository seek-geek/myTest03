package org.example;

import static org.junit.Assert.assertTrue;

import com.itheima.bean.Account;
import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
            AccountService service = (AccountService) applicationContext.getBean("service");
            List<Account> all = service.findAll();
            for (Account account : all) {
                System.out.println(account.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
