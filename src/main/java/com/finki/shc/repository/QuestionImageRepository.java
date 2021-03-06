package com.finki.shc.repository;

import com.finki.shc.domain.QuestionImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Spring Data JPA repository for the QuestionImage entity.
 */
public interface QuestionImageRepository extends JpaRepository<QuestionImage,Long>{
    List<QuestionImage> findAllByQuestionId(Long id);
}
