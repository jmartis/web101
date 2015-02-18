package com.jmartis.web101.dao;

import com.jmartis.web101.domain.Payment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


/**
 * Created by Jovanny on 2/18/2015.
 */
@Repository
@Transactional
public class PaymentDao {

    @PersistenceContext
    private EntityManager em;

    public void persist(Object o) {
        em.persist(o);
    }

    public void remove(Object o) {
        em.remove(o);
    }

    public Payment find(Long id) {
        return em.find(Payment.class, id);
    }
}
