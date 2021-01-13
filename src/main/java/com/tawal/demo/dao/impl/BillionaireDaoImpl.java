package com.tawal.demo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.tawal.demo.dao.BillionaireDao;
import com.tawal.demo.model.Billionaire;

@Repository
public class BillionaireDaoImpl implements BillionaireDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Billionaire> getBillionaires() {
        Criteria criteria = entityManager.unwrap(Session.class).createCriteria(Billionaire.class);
        return criteria.list();
    }

}
