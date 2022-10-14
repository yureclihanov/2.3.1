package web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public interface Dao extends JpaRepository<User, Integer> {
}
