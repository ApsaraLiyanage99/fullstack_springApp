package com.projectwithspring.fullstackbackend.repository;

import com.projectwithspring.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
