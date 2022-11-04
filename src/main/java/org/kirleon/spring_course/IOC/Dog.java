package org.kirleon.spring_course.IOC;

public class Dog implements Pet{
    public Dog(){
        System.out.println("Dog bean is created");
    }
    public void say(){
        System.out.println("Bow-wow");
    }
}
