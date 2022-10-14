package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.Dao;
import web.model.User;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ServiseImpl {

    private Dao dao;

    @Autowired
    public ServiseImpl(Dao dao) {
        this.dao = dao;
    }

    public List<User> findAll() {
        return dao.findAll();
    }

    public User findOne(int id) {
        Optional<User> user = dao.findById(id);
        return user.orElse(null);
    }

    @Transactional
    public void saveUser(User user) {
        dao.save(user);
    }

    @Transactional
    public void updateUser(int id, User updateUser) {
        updateUser.setId(id);
        dao.save(updateUser);
    }

    @Transactional
    public void deleteById(int id) {
        dao.deleteById(id);
    }


    //   private final DaoImpl daoImpl;
//
    //   public ServiseImpl(DaoImpl daoImpl) {
    //       this.daoImpl = daoImpl;
    //   }
//
    //   @Override
    //   public List<User> allUsers() {
    //       return daoImpl.allUsers();
    //   }
//
    //   @Override
    //   public User findUserById(int id) {
    //       return daoImpl.findUserById(id);
    //   }
//
    //   @Override
    //   public void add(User user) {
    //       daoImpl.add(user);
    //   }
//
    //   @Override
    //   public User update(User user) {
    //       return daoImpl.update(user);
    //   }
//
    //   @Override
    //   public void deleteById(int id) {
    //       daoImpl.deleteById(id);
    //   }
}
