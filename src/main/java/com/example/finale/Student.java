package com.example.finale;
//refer useobject.java and student.jsp, displaystudent.jsp
public class Student {
    String name;

    public Student(String name, Integer age, String usn) {
        this.name = name;
        this.age = age;
        this.usn = usn;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    Integer age;
    String usn;
}
