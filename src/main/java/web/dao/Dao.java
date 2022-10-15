package web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

public interface Dao {
    List<User> allUsers();
    User findUserById(int id);
    void add(User user);
    User update(User user);
    void deleteById(int id);
}
