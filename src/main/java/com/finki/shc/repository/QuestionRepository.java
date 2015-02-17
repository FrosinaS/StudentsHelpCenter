package com.finki.shc.repository;

import com.finki.shc.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Question entity.
 */
public interface QuestionRepository extends JpaRepository<Question,Long>{

}