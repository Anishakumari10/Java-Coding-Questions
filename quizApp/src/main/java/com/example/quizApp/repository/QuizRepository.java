package com.example.quizApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.quizApp.entity.QuizEntity;

import jakarta.transaction.Transactional;

@Repository
public interface QuizRepository extends CrudRepository<QuizEntity,Long> {
	
	@Transactional
	@Modifying
	@Query("UPDATE QuizEntity qe SET qe.name = :name WHERE qe.id = :id")
	public QuizEntity updateQuiz(@Param("id") Long id, @Param("name") String name);

	
	@Transactional
	@Query("SELECT qe FROM QuizEntity qe WHERE qe.name = :name")
	public List<QuizEntity> findQuizByName(String name);

}
