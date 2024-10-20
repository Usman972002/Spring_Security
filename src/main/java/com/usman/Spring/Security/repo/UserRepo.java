package com.usman.Spring.Security.repo;

import com.usman.Spring.Security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

    User findByUsername(String username);

}
