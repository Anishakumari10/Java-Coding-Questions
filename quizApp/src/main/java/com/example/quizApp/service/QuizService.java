package com.example.quizApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quizApp.entity.QuizEntity;
import com.example.quizApp.repository.QuizRepository;

@Service
public class QuizService implements QuizRepository {

	@Autowired
	QuizRepository quizRepository;

	public QuizEntity createQuiz(QuizEntity qe) {
		return quizRepository.save(qe);

	}

	@Override
	public <S extends QuizEntity> S save(S entity) {

		return quizRepository.save(entity);
	}

	@Override
	public <S extends QuizEntity> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<QuizEntity> findAll() {
		return quizRepository.findAll();
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(QuizEntity entity) {
		Optional<QuizEntity> byId = quizRepository.findById(entity.getId());
		if (byId.isPresent()) {
			quizRepository.delete(entity);
		}

	}

	@Override
	public void deleteAll(Iterable<? extends QuizEntity> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<QuizEntity> findById(Long id) {

		return quizRepository.findById(id);

	}
	
	public List<QuizEntity>findQuizByName(String name){
		return quizRepository.findQuizByName(name);
		
		
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteById(Long id) {

		quizRepository.deleteById(id);

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterable<QuizEntity> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public QuizEntity updateQuizById(Long id, QuizEntity updateQe) {

		Optional<QuizEntity> optionalQuiz = quizRepository.findById(id);
		QuizEntity quizEntityToUpdate = null;
		if (optionalQuiz.isPresent()) {
			
			QuizEntity existingQuiz = optionalQuiz.get();
			existingQuiz.setName(updateQe.getName());
			existingQuiz.setQuestion(updateQe.getQuestion());
			quizEntityToUpdate = quizRepository.save(existingQuiz);
		
		}
		return quizEntityToUpdate;

	}

	@Override
	public QuizEntity updateQuiz(Long id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
