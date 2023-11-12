package com.javacurso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacurso.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
