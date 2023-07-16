package com.atquil.springconcepts.dependencyInjectionAndIoC;

//Without DI:
// College and Student are tightly coupled
public class College {
    Student student;

    //Constructor
    public College(){
        // Here we must need Student for College to work
        student = new Student();
    }

}
class Student{}


class CollegeWithDI {
    Student student;

    //Constructor Injection:
    public CollegeWithDI(Student student){
        //When you are creating the object of College spring will create the object of Student and Inject to College.
        this.student = student;
    }
}

//IOC: The control of object creation is given to Spring thus called Inversion of control