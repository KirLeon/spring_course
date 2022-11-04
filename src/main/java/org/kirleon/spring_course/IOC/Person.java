package org.kirleon.spring_course.IOC;

public class Person {
    private Pet pet;
    private String name;
    private String surname;
//    public Person(Pet pet){
//        this.pet = pet;
//        System.out.println("Person bean is created");
//    }
    public Person(){
        System.out.println("Person bean is created");
    }
    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
    //pet ---> setPet
    public void setPet(Pet pet){
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
