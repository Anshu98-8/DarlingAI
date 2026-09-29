package com.CodingBrajmohan.DarlingAI.repository;

import com.CodingBrajmohan.DarlingAI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
