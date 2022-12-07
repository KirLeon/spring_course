package org.kirleon.spring_course.IOC;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Context_updater {
    public void update_context(){
        try(FileWriter FW = new FileWriter("E:/JavaProjects/spring_course/resources/spring_course.properties");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Введите фамилию человека");
            String surname = reader.readLine();
            FW.write("person.surname = " + surname);
            System.out.println("Введите имя человека");
            String name = reader.readLine();
            FW.write('\n');
            FW.write("person.name = " + name);
            System.out.println("Введите возраст человека");
            String age = reader.readLine();
            FW.write('\n');
            FW.write("person.age = " + age);
            System.out.println("Сделано");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
