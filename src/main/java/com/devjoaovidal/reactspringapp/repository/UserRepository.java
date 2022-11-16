package com.devjoaovidal.reactspringapp.repository;

import com.devjoaovidal.reactspringapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
