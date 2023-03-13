package com.example.api.students;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName="student_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")

    private Long id;
    private String name;
    private LocalDate dob;



    public Student() {

    }

    public Student(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public LocalDate getDob() {
        return dob;
    }


    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
