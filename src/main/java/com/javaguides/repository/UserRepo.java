package com.javaguides.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.javaguides.model.User;

@Repository
@Service
public interface UserRepo extends JpaRepository<User,Long> {
}
