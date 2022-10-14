package web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public class DaoImpl  {

  //  @PersistenceContext
  //  private EntityManager entityManager;
//
  //  @Override
  //  @Transactional(readOnly = true)
  //  public List<User> allUsers() {
  //      String jpql  = "SELECT u FROM User u";
  //      return entityManager.createQuery(jpql, User.class).getResultList();
  //  }
//
  //  @Override
  //  @Transactional(readOnly = true)
  //  public User findUserById(int id) {
  //      return entityManager.find(User.class, id);
  //  }
//
  //  @Override
  //  @Transactional
  //  public void add(User user) {
  //      entityManager.persist(user);
  //  }
//
  //  @Override
  //  @Transactional
  //  public User update(User user) {
  //      return entityManager.merge(user);
  //  }
//
  //  @Override
  //  @Transactional
  //  public void deleteById(int id) {
  //      entityManager.remove(entityManager.find(User.class, id));
  //  }
}
