package com.quizgame.controller;

import com.quizgame.model.Question;
import com.quizgame.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
@CrossOrigin(origins = "*")
public class QuizController {
    
    @Autowired
    private QuizService quizService;
    
    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return quizService.getAllQuestions();
    }
    
    @PostMapping("/submit")
    public String submitQuiz(@RequestBody List<Boolean> answers) {
        int score = quizService.calculateScore(answers);
        return "Your score: " + score + "/" + answers.size();
    }
}
@PostMapping("/submit")
public QuizResponse submitQuiz(@RequestBody List<Boolean> answers) {
    int score = quizService.calculateScore(answers);
    return new QuizResponse(score, answers.size());
}
