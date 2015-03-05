package com.finki.shc.repository;

import com.finki.shc.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Spring Data JPA repository for the Answer entity.
 */
public interface AnswerRepository extends JpaRepository<Answer,Long>{
    List<Answer> findAllByQuestionId(Long id);
}
