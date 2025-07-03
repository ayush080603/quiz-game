package com.quizgame.model;

public class QuizResponse {
    private int score;
    private int totalQuestions;
    private double percentage;
    private String message;
    
    // Constructors
    public QuizResponse() {}
    
    public QuizResponse(int score, int totalQuestions) {
        this.score = score;
        this.totalQuestions = totalQuestions;
        this.percentage = (double) score / totalQuestions * 100;
        this.message = generateMessage();
    }
    
    // Getters and Setters
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
        this.percentage = (double) score / totalQuestions * 100;
        this.message = generateMessage();
    }
    
    public int getTotalQuestions() {
        return totalQuestions;
    }
    
    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
        this.percentage = (double) score / totalQuestions * 100;
        this.message = generateMessage();
    }
    
    public double getPercentage() {
        return percentage;
    }
    
    public String getMessage() {
        return message;
    }
    
    private String generateMessage() {
        if (percentage == 100) {
            return "Perfect Score! 🏆";
        } else if (percentage >= 80) {
            return "Excellent Work! 🌟";
        } else if (percentage >= 60) {
            return "Good Job! 👍";
        } else {
            return "Keep Learning! 📚";
        }
    }
}
