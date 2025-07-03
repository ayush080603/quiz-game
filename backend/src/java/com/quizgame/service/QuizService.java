package com.quizgame.service;

import com.quizgame.model.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class QuizService {
    
    private List<Question> questions;
    
    public QuizService() {
        initializeQuestions();
    }
    
    private void initializeQuestions() {
        questions = new ArrayList<>();
        
        questions.add(new Question("The capital of France is Paris.", true));
        questions.add(new Question("Python is a compiled programming language.", false));
        questions.add(new Question("The Earth is flat.", false));
        questions.add(new Question("HTML stands for HyperText Markup Language.", true));
        questions.add(new Question("JavaScript and Java are the same programming language.", false));
        questions.add(new Question("The human brain has four chambers.", false));
        questions.add(new Question("CSS stands for Cascading Style Sheets.", true));
        questions.add(new Question("The Pacific Ocean is the largest ocean on Earth.", true));
        questions.add(new Question("React is a JavaScript library for building user interfaces.", true));
        questions.add(new Question("SQL stands for Structured Query Language.", true));
        questions.add(new Question("The speed of light is approximately 300,000 km/s.", true));
        questions.add(new Question("A byte consists of 8 bits.", true));
        questions.add(new Question("The Great Wall of China is visible from space.", false));
        questions.add(new Question("TypeScript is a superset of JavaScript.", true));
        questions.add(new Question("The Amazon River is the longest river in the world.", true));
        questions.add(new Question("Java is platform independent.", true));
        questions.add(new Question("HTML is used to create web pages.", true));
        questions.add(new Question("Python supports multiple inheritance.", true));
        questions.add(new Question("CSS is used for styling.", true));
        questions.add(new Question("JavaScript runs only on the backend.", false));
        questions.add(new Question("C++ is a compiled language.", true));
        questions.add(new Question("React is a JavaScript library.", true));
        questions.add(new Question("SQL is used to query databases.", true));
        questions.add(new Question("Git is a version control system.", true));
        questions.add(new Question("Linux is open source.", true));
        questions.add(new Question("Node.js runs on the V8 engine.", true));
        questions.add(new Question("JSON is a markup language.", false));
        questions.add(new Question("Bootstrap is used for responsive design.", true));
        questions.add(new Question("AJAX enables asynchronous page updates.", true));
        questions.add(new Question("Kotlin is not compatible with Java.", false));
        questions.add(new Question("TypeScript compiles to JavaScript.", true));
        questions.add(new Question("HTTP is a secure protocol by default.", false));
        questions.add(new Question("TCP is connection-oriented.", true));
        questions.add(new Question("UDP guarantees packet delivery.", false));
        questions.add(new Question("SMTP is used to send emails.", true));
        questions.add(new Question("IMAP is used to retrieve emails.", true));
        questions.add(new Question("TLS stands for Transport Layer Security.", true));
        questions.add(new Question("SSL is still recommended over TLS.", false));
        questions.add(new Question("IPv6 addresses are 128 bits long.", true));
        questions.add(new Question("DNS translates IP to domain names.", false));
        questions.add(new Question("MAC address is unique to each network device.", true));
        questions.add(new Question("The OSI model has 7 layers.", true));
        questions.add(new Question("TCP is connectionless.", false));
        questions.add(new Question("UDP is faster than TCP.", true));
        questions.add(new Question("Windows is a Linux distribution.", false));
        questions.add(new Question("Android is based on the Linux kernel.", true));
        questions.add(new Question("Assembly is a high-level language.", false));
        questions.add(new Question("Python is case-sensitive.", true));
        questions.add(new Question("Java supports operator overloading.", false));
        questions.add(new Question("HTML is a programming language.", false));
        questions.add(new Question("CSS can be used to create animations.", true));
        questions.add(new Question("A variable in JavaScript can be declared using var, let, or const.", true));
        questions.add(new Question("MySQL is a NoSQL database.", false));
        questions.add(new Question("MongoDB is a NoSQL database.", true));
        questions.add(new Question("GitHub is a Git repository hosting service.", true));
        questions.add(new Question("React Native is used for building desktop apps.", false));
        questions.add(new Question("Docker containers are isolated environments.", true));
        questions.add(new Question("Kubernetes manages virtual machines.", false));
        questions.add(new Question("Flutter uses the Dart programming language.", true));
        questions.add(new Question("Vue.js is a Python framework.", false));
        questions.add(new Question("Machine Learning is a subset of AI.", true));
        questions.add(new Question("Python was created before Java.", true));
        questions.add(new Question("Go was developed at Google.", true));
        questions.add(new Question("C# is a Microsoft technology.", true));
        questions.add(new Question("Linux cannot run on mobile devices.", false));
        questions.add(new Question("Firebase is a backend-as-a-service.", true));
        questions.add(new Question("Java and JavaScript are unrelated.", false));
        questions.add(new Question("Pandas is a library for data analysis in Python.", true));
        questions.add(new Question("NumPy helps with numerical computing in Python.", true));
        questions.add(new Question("Jupyter Notebook is used for data visualization only.", false));
        questions.add(new Question("APIs allow software components to communicate.", true));
        questions.add(new Question("JSON stands for Java Object Notation.", false));
        questions.add(new Question("You can use Git without GitHub.", true));
        questions.add(new Question("HTML elements can have attributes.", true));
        questions.add(new Question("CSS uses tags like <style> to apply styling.", false));
        questions.add(new Question("React uses JSX to write HTML in JavaScript.", true));
        questions.add(new Question("The DOM stands for Document Object Model.", true));
        questions.add(new Question("Async functions in JS return a Promise.", true));
        questions.add(new Question("Java uses garbage collection.", true));
        questions.add(new Question("Python does not support OOP.", false));
        questions.add(new Question("The Linux shell is the GUI part of the OS.", false));
        questions.add(new Question("DNS stands for Domain Name System.", true));
        questions.add(new Question("SQL Injection is a security vulnerability.", true));
        questions.add(new Question("HTTPS is more secure than HTTP.", true));
        questions.add(new Question("ORM stands for Object Relational Mapping.", true));
        questions.add(new Question("MongoDB stores data in tables.", false));
        questions.add(new Question("A loop that never ends is called an infinite loop.", true));
        questions.add(new Question("The 'final' keyword in Java makes a variable constant.", true));
        questions.add(new Question("C is a strongly typed language.", false));
        questions.add(new Question("POST method is idempotent in REST APIs.", false));
        questions.add(new Question("Angular is a JavaScript framework developed by Facebook.", false));
        questions.add(new Question("CSS Grid is a 2D layout system.", true));
        questions.add(new Question("Flexbox is a 2D layout system.", false));
        questions.add(new Question("Docker images are read-only templates.", true));
        questions.add(new Question("Python lists are mutable.", true));
        questions.add(new Question("Python tuples are mutable.", false));
        questions.add(new Question("A compiler translates source code to machine code.", true));
        questions.add(new Question("An interpreter executes code line by line.", true));
        questions.add(new Question("JavaScript is statically typed.", false));
        questions.add(new Question("The ternary operator is a shortcut for if-else.", true));
        questions.add(new Question("CSS media queries help with responsiveness.", true));
        questions.add(new Question("Vue components use `.jsx` files by default.", false));
        questions.add(new Question("Angular uses decorators like @Component.", true));
        questions.add(new Question("HTTP 404 means OK.", false));
        questions.add(new Question("HTTP 200 means success.", true));
        questions.add(new Question("SQL joins combine data from multiple tables.", true));
        questions.add(new Question("The JVM is part of Python.", false));
        questions.add(new Question("Git stash temporarily shelves changes.", true));
        questions.add(new Question("Git clone creates a local copy of a repo.", true));
        questions.add(new Question("An API key is used for authentication.", true));
        questions.add(new Question("Firebase can be used for real-time databases.", true));
        questions.add(new Question("The OS kernel manages hardware resources.", true));
        questions.add(new Question("A CDN stores websites in local databases.", false));
        questions.add(new Question("HTML5 supports audio and video tags.", true));
        questions.add(new Question("CSS3 introduced animations.", true));
        questions.add(new Question("HTTPS uses port 80.", false));
        questions.add(new Question("WebAssembly allows running compiled code in browsers.", true));
        questions.add(new Question("Python was developed by Brendan Eich.", false));
        questions.add(new Question("React is maintained by Meta (Facebook).", true));
        questions.add(new Question("The virtual DOM improves performance in React.", true));
        
    }
    
    public List<Question> getAllQuestions() {
    Collections.shuffle(questions); // Shuffle every time this method is called
    return questions;
}

    public int calculateScore(List<Boolean> userAnswers) {
        int score = 0;
        for (int i = 0; i < userAnswers.size() && i < questions.size(); i++) {
            if (userAnswers.get(i).equals(questions.get(i).getAnswer())) {
                score++;
            }
        }
        return score;
    }
}