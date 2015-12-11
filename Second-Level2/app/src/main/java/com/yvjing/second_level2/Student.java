package com.yvjing.second_level2;

/**
 * Created by Yvjing on 2015/12/11.
 */
public class Student {
    private String name;
    private String grade;

    public Student(String name,String grade){
        this.name=name;
        this.grade=grade;
    }

    public String getName(){
        return name;
    }

    public String getGrade(){
        return grade;
    }
}
