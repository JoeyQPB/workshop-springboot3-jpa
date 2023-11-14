package com.javacurso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javacurso.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
