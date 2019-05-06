package com.ouyang;

/**
 * ouyangjie
 * 2019/5/5
 * 17:36
 */
public class Student {

    private Integer age;

    private String name;

    private Integer score;


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Student(String name, Integer score,Integer age) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
