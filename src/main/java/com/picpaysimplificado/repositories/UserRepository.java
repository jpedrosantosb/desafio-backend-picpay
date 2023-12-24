package com.picpaysimplificado.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.picpaysimplificado.domain.user.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long> {

	Optional<User> findUserByDocument(String document);

	Optional<User> findUserById(Long id);
}
