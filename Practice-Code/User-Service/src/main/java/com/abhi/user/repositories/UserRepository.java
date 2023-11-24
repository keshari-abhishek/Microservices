package com.abhi.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.user.entities.User;

public interface UserRepository extends JpaRepository<User,String>{

}
