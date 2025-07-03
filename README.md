# 🧠 Spring Boot True/False Quiz App

This is a simple True/False quiz application built using **Java**, **Spring Boot**, and **REST APIs**. It includes a backend service that provides shuffled programming-related quiz questions.

## 🚀 Features

- ✅ True/False style questions
- 🔀 Questions are shuffled every time you start the app or fetch them
- 🧠 Covers programming, web development, databases, and general tech
- 📊 Score is calculated based on user responses
- 🔗 Ready for deployment (e.g., Render, Railway, etc.)

---

## 📁 Project Structure

quiz-game/
├── src/
│ └── main/
│ └── java/
│ └── com/
│ └── quizgame/
│ ├── model/
│ │ └── Question.java
│ ├── service/
│ │ └── QuizService.java
│ └── controller/
│ └── QuizController.java
├── pom.xml
└── README.md

---

## 🔧 Technologies Used

- Java 17+
- Spring Boot
- RESTful Web Services
- Maven

---

## 📡 API Endpoints

| Method | Endpoint        | Description                          |
|--------|------------------|--------------------------------------|
| GET    | `/questions`     | Fetches all quiz questions (shuffled) |
| POST   | `/score`         | Submit answers & get score (optional) |

---

## 🧪 Sample Question Format

    ```json
    {
      "question": "Java is platform independent.",
      "answer": true
    }
## 🚀 Run the Application

  **Prerequisites**
  - Java 17 or higher
  - Maven
    
  **Steps**
  
      git clone https://github.com/ayush080603/quiz-game.git
      cd quiz-game
      ./mvnw spring-boot:run
          
  **Then visit:**
  
        http://localhost:8080/questions
       
## 🌐 Deployment (Render)
  1. Push code to GitHub
  2. Go to https://render.com
  3. Create a New Web Service
  4. Connect your GitHub repo
  5. Set:
     - Build Command: ./mvnw clean package
     - Start Command: java -jar target/*.jar
  6. Click Deploy

## 🙋‍♂️ Author

  Ayush Sinha
  📫 LinkedIn: www.linkedin.com/in/sinhaayush0806
  🌐 GitHub: https://github.com/ayush080603
