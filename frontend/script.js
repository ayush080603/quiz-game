class QuizGame {
    constructor() {
        this.questions = [];
        this.currentQuestion = 0;
        this.score = 0;
        this.isAnswered = false;
        this.totalQuestions = 0;
        this.loadQuestions();
    }

    async loadQuestions() {
        try {
            // Replace with your Java backend URL
            const response = await fetch('http://localhost:8080/api/quiz/questions');
            this.questions = await response.json();
            this.totalQuestions = this.questions.length;
            this.displayQuestion();
        } catch (error) {
            console.error('Error loading questions:', error);
            // Fallback questions for testing without backend
            this.questions = [
                { text: "The capital of France is Paris.", answer: true },
                { text: "Python is a compiled programming language.", answer: false },
                { text: "The Earth is flat.", answer: false },
                { text: "HTML stands for HyperText Markup Language.", answer: true },
                { text: "JavaScript and Java are the same programming language.", answer: false },
                { text: "The human brain has four chambers.", answer: false },
                { text: "CSS stands for Cascading Style Sheets.", answer: true },
                { text: "The Pacific Ocean is the largest ocean on Earth.", answer: true },
                { text: "React is a JavaScript library for building user interfaces.", answer: true },
                { text: "SQL stands for Structured Query Language.", answer: true },
                { text: "The speed of light is approximately 300,000 km/s.", answer: true },
                { text: "A byte consists of 8 bits.", answer: true },
                { text: "The Great Wall of China is visible from space.", answer: false },
                { text: "TypeScript is a superset of JavaScript.", answer: true },
                { text: "The Amazon River is the longest river in the world.", answer: true }
            ];
            this.totalQuestions = this.questions.length;
            this.displayQuestion();
        }
    }

    displayQuestion() {
        if (this.currentQuestion >= this.questions.length) {
            this.showFinalResults();
            return;
        }

        const question = this.questions[this.currentQuestion];
        document.getElementById('question-text').textContent = question.text;
        document.getElementById('question-counter').textContent = 
            `Question ${this.currentQuestion + 1} of ${this.totalQuestions}`;
        document.getElementById('score-display').textContent = 
            `Score: ${this.score}/${this.currentQuestion}`;
        
        this.updateProgressBar();
        this.resetAnswerButtons();
        this.hideResultSection();
    }

    updateProgressBar() {
        const progress = ((this.currentQuestion + 1) / this.totalQuestions) * 100;
        document.getElementById('progress-fill').style.width = `${progress}%`;
    }

    resetAnswerButtons() {
        this.isAnswered = false;
        const buttons = document.querySelectorAll('.answer-buttons .btn');
        buttons.forEach(btn => {
            btn.disabled = false;
            btn.style.opacity = '1';
        });
        document.getElementById('answer-buttons').style.display = 'grid';
    }

    answerQuestion(selectedAnswer) {
        if (this.isAnswered) return;

        this.isAnswered = true;
        const correctAnswer = this.questions[this.currentQuestion].answer;
        const isCorrect = selectedAnswer === correctAnswer;

        if (isCorrect) {
            this.score++;
        }

        this.showResult(isCorrect, correctAnswer);
        this.disableAnswerButtons();

        // Auto-advance after 2 seconds
        setTimeout(() => {
            this.nextQuestion();
        }, 2000);
    }

    showResult(isCorrect, correctAnswer) {
        const resultSection = document.getElementById('result-section');
        const resultCard = document.getElementById('result-card');
        const resultIcon = document.getElementById('result-icon');
        const resultText = document.getElementById('result-text');
        const resultExplanation = document.getElementById('result-explanation');

        resultCard.className = `result-card ${isCorrect ? 'correct' : 'incorrect'}`;
        resultIcon.textContent = isCorrect ? '✅' : '❌';
        resultText.textContent = isCorrect ? 'Correct!' : 'Incorrect!';
        resultExplanation.textContent = `The correct answer is: ${correctAnswer ? 'True' : 'False'}`;

        resultSection.style.display = 'block';
        document.getElementById('answer-buttons').style.display = 'none';
    }

    hideResultSection() {
        document.getElementById('result-section').style.display = 'none';
    }

    disableAnswerButtons() {
        const buttons = document.querySelectorAll('.answer-buttons .btn');
        buttons.forEach(btn => {
            btn.disabled = true;
            btn.style.opacity = '0.6';
        });
    }

    nextQuestion() {
        const nextQuestionIndex = this.currentQuestion + 1;
        
        // Check if we should show continue prompt (every 5 questions)
        if (nextQuestionIndex % 5 === 0 && nextQuestionIndex < this.questions.length) {
            this.showContinuePrompt();
            return;
        }

        if (nextQuestionIndex >= this.questions.length) {
            this.showFinalResults();
        } else {
            this.moveToNextQuestion();
        }
    }

    moveToNextQuestion() {
        this.currentQuestion++;
        this.displayQuestion();
    }

    showContinuePrompt() {
        document.getElementById('completed-questions').textContent = this.currentQuestion + 1;
        document.getElementById('current-score').textContent = `${this.score}/${this.currentQuestion + 1}`;
        document.getElementById('continue-prompt').style.display = 'flex';
    }

    continueQuiz(shouldContinue) {
        document.getElementById('continue-prompt').style.display = 'none';
        
        if (shouldContinue && this.currentQuestion + 1 < this.questions.length) {
            this.moveToNextQuestion();
        } else {
            this.showFinalResults();
        }
    }

    showFinalResults() {
        const finalScore = `${this.score}/${this.currentQuestion + 1}`;
        const percentage = (this.score / (this.currentQuestion + 1)) * 100;
        
        let message = "Keep Learning! 📚";
        if (percentage === 100) message = "Perfect Score! 🏆";
        else if (percentage >= 80) message = "Excellent Work! 🌟";
        else if (percentage >= 60) message = "Good Job! 👍";

        document.getElementById('final-score-display').textContent = finalScore;
        document.getElementById('performance-message').textContent = message;
        document.getElementById('final-results').style.display = 'flex';
    }

    restartQuiz() {
        this.currentQuestion = 0;
        this.score = 0;
        this.isAnswered = false;
        document.getElementById('final-results').style.display = 'none';
        document.getElementById('continue-prompt').style.display = 'none';
        this.displayQuestion();
    }
}

// Global functions for HTML onclick events
let quiz;

function answerQuestion(answer) {
    quiz.answerQuestion(answer);
}

function continueQuiz(shouldContinue) {
    quiz.continueQuiz(shouldContinue);
}

function restartQuiz() {
    quiz.restartQuiz();
}

// Initialize the quiz when the page loads
window.addEventListener('DOMContentLoaded', () => {
    quiz = new QuizGame();
});
