package org.kirleon.spring_course.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Ввод данных в properties файл
public class Test3 {
    public static void main(String[] args) {
        Context_updater cont_unt = new Context_updater();
        cont_unt.update_context();
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")){
            Person person = context.getBean("myPerson", Person.class);
            person.callYourPet();
            System.out.println(person.getSurname());
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
    }
}
