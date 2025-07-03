package com.quizgame.model;

import jakarta.persistence.*;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 500)
    private String text;
    
    @Column(nullable = false)
    private Boolean answer;
    
    // Constructors
    public Question() {}
    
    public Question(String text, Boolean answer) {
        this.text = text;
        this.answer = answer;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public Boolean getAnswer() {
        return answer;
    }
    
    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }
}
