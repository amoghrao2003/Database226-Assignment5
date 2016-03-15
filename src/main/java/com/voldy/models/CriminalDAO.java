package com.voldy.models;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public class CriminalDAO {
  
  @Autowired
  private SessionFactory _sessionFactory;
  
  private Session getSession() {
    return _sessionFactory.getCurrentSession();
  }

  public void save(Criminal user) {
    getSession().save(user);
  }
  
  public void delete(Criminal user) {
    getSession().delete(user);
  }
  
  @SuppressWarnings("unchecked")
  public List getAll() {
    return getSession().createQuery("from Criminal").list();
  }
  
  public Criminal getByName(String criminal_name) {
    return (Criminal) getSession().createQuery(
        "from Criminal where criminal_name = :criminal_name")
        .setParameter("criminal_name", criminal_name)
        .uniqueResult();
  }

  public Criminal getById(long id) {
    return (Criminal) getSession().load(Criminal.class, id);
  }

  public void update(Criminal user) {
    getSession().update(user);
  }

}
