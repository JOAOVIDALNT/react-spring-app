package com.devjoaovidal.backend.repository;

import com.devjoaovidal.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
