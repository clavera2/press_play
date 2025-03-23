package com.alfred.claver.press.play.entities;
import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
    String name;
    int age;
    String college;
    String course;
    String[] modules;

    public Student(String name, int age, String college, String course, String[] modules) {
        this.name = name;
        this.age = age;
        this.college = college;
        this.course = course;
        this.modules = modules;
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setCollege(String college) {this.college = college;}
    public void setCourse(String course){this.course = course;}
    public void setModules(String[] modules) {this.modules = modules;}
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getCollege() {return college;}
    public String getCourse() {return course;}
    public String[] getModules() {return modules;}

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + " , college: " + college + " , course: " + course + " , modules: " + Arrays.toString(modules);
    }
}
