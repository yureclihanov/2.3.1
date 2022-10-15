package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.Dao;
import web.model.User;

import java.util.List;

@Service
@Transactional
public class ServiseImpl implements Servise {

    private Dao dao;

    @Autowired
    public ServiseImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<User> allUsers() {
        return dao.allUsers();
    }

    @Override
    public User findUserById(int id) {
        return dao.findUserById(id);
    }

    @Override
    public void add(User user) {
        dao.add(user);
    }

    @Override
    public User update(User user) {
        return dao.update(user);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }
}
