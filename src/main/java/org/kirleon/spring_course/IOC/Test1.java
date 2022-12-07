package org.kirleon.spring_course.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//IOC
public class Test1 {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml")){
            Pet pet = context.getBean("myPet", Pet.class);
            //Pet pet = new Dog();
            pet.say();
        }


    }
}
