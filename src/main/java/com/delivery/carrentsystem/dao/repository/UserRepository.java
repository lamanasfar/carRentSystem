package com.delivery.carrentsystem.dao.repository;

import com.delivery.carrentsystem.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username); //loginde username yazib daxil olmaga

    boolean existsByUsername(String username);  //username movcuddursa admin ferqli username vermelidi

}