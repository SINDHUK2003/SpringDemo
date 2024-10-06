package com.project.Spotknack.Repository;

import com.project.Spotknack.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    List<User> findByusername(String username);
    List<User> findUsername(Integer userid);
}
