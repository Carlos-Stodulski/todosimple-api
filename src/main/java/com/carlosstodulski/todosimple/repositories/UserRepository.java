package com.carlosstodulski.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlosstodulski.todosimple.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    
    
}
