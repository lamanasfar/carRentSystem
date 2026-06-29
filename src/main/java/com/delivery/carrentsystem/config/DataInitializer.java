package com.delivery.carrentsystem.config;

import com.delivery.carrentsystem.dao.entity.UserEntity;
import com.delivery.carrentsystem.dao.repository.UserRepository;
import com.delivery.carrentsystem.enums.UserRole;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Role;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class DataInitializer {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Bean
    public ApplicationRunner applicationRunner() {

        return args -> {

            if (userRepository.findByUsername("admin").isEmpty()) {

                UserEntity admin = new UserEntity();

                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("Admin123"));
                admin.setRole(UserRole.ADMIN);
                admin.setEnabled(true);

                userRepository.save(admin);
            }
        };
    }
}