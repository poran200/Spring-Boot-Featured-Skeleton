package com.example.servicito.domains.notifications.services;

import com.example.acl.domains.users.repositories.UserRepository;
import com.example.servicito.domains.notifications.models.entities.FirebaseUserToken;
import com.example.servicito.domains.notifications.repositories.FirebaseTokenRepository;
import com.example.auth.entities.User;
import com.example.common.exceptions.invalid.InvalidException;
import com.example.common.exceptions.notfound.FirebaseTokenNotFoundException;
import com.example.common.exceptions.notfound.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirebaseTokenServiceImpl implements FirebaseTokenService {
    private final FirebaseTokenRepository firebaseTokenRepo;
    private final UserRepository userRepository;

    @Autowired
    public FirebaseTokenServiceImpl(FirebaseTokenRepository firebaseTokenRepo, UserRepository userRepository) {
        this.firebaseTokenRepo = firebaseTokenRepo;
        this.userRepository = userRepository;
    }

    @Override
    public FirebaseUserToken save(FirebaseUserToken token) throws InvalidException {
        if (token == null) throw new InvalidException("Token can not be null!");
        return this.firebaseTokenRepo.save(token);
    }

    @Override
    public FirebaseUserToken get(Long userId) throws FirebaseTokenNotFoundException {
        return this.firebaseTokenRepo.findByUserId(userId);
    }

    @Override
    public FirebaseUserToken save(Long userId, String token) throws InvalidException, UserNotFoundException {
        if (userId == null || token == null) throw new InvalidException("userId or token can not be null");
        User user = this.userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("Couldn't find user with id: " + userId));
        FirebaseUserToken firebaseUserToken = this.firebaseTokenRepo.findByUserId(userId);
        if (firebaseUserToken != null)
            firebaseUserToken.setUserToken(token);
        else
            firebaseUserToken = new FirebaseUserToken(user, token);
        return this.save(firebaseUserToken);
    }
}
