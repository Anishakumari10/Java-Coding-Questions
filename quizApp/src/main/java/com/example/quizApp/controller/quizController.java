package com.example.quizApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.quizApp.entity.QuizEntity;
import com.example.quizApp.service.QuizService;

@RestController
public class quizController {

	@Autowired
	QuizService quizService;

	@PostMapping("/createQuiz")
	public ResponseEntity<QuizEntity> createQuiz(@RequestBody QuizEntity quizrequest) {

		QuizEntity savedQuizEntity = quizService.save(quizrequest);
		return ResponseEntity.ok(savedQuizEntity);

	}

	@GetMapping("/getAllQuestions")
	public ResponseEntity<Iterable<QuizEntity>> getAllQuestions() {

		return ResponseEntity.ok(quizService.findAll());
	}
	
	@GetMapping("/getQuestionById/{id}")
	public ResponseEntity<Optional<QuizEntity>> getQuestionById(@PathVariable Long id) {

		return ResponseEntity.ok(quizService.findById(id));
	}
	
	@GetMapping("/getQuestionByName/{name}")
	public ResponseEntity<List<QuizEntity>> getQuestionByName(@PathVariable String name) {

		return ResponseEntity.ok(quizService.findQuizByName(name));
	}
	
	

	@DeleteMapping("/deleteId/{id}")
	public ResponseEntity<String> deleteQuestion(@PathVariable Long id) {
		quizService.deleteById(id);
		return ResponseEntity.ok("Id Deleted "+ id +" successfully");
		

	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<QuizEntity>updateQuizById(@PathVariable Long id, @RequestBody QuizEntity updatedQe){
		  return ResponseEntity.ok(quizService.updateQuizById(id, updatedQe));
		
	}
	
	
}
