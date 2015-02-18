package com.jmartis.web101.dao;

import com.jmartis.web101.domain.Account;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class PaymentDaoTest {

    @Autowired
    private PaymentDao paymentDao;
    @Autowired
    private AccountDao accountDao;



    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void test(){

        Account account = new Account();
        account.setNumber("12334");
        account.setName("example");
        accountDao.persist(account);
    }
}