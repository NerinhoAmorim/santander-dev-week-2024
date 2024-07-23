package me.dio.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	boolean existsByAccountNumber(String number);
	boolean existsByCardNumber(String number);

}
