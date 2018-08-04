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
            initialValue = 1001
    )
    public long id;
    public String question;

    public Question(){

    }
}
