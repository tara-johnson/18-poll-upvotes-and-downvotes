package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="questionpoll")
public class Question {
    @Id
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(
            name = "question_generator",
            sequenceName = "question_sequence",
            initialValue = 1000
    )
    long id;
    String question;

    public Question(){

    }
}
