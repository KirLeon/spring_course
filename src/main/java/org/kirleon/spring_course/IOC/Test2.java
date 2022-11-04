package org.kirleon.spring_course.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {


        //Without Dependency Injection of Spring

//        Pet pet = new Dog();
//        Person person = new Person(pet);
//        person.callYourPet();

        //Now we have hard dependency


        //Using Spring Container

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
//        person.callYourPet();

        //Now dependency has become less, but still not enough


        //Using Dependency Injection of Spring
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")){
            Person person = context.getBean("myPerson", Person.class);
            person.callYourPet();
        }



        //And now, we've outsourced Dependency Injection to Spring Container. That's how it's work
    }

}
