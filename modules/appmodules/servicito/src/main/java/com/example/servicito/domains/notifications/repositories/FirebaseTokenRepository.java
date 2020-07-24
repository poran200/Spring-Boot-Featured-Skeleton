package com.example.servicito.domains.notifications.repositories;

import com.example.servicito.domains.notifications.models.entities.FirebaseUserToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirebaseTokenRepository extends JpaRepository<FirebaseUserToken, Long> {
    FirebaseUserToken findByUserId(Long userId);
}
