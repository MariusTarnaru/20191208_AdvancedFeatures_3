package AdvancedFeatures;

import javax.swing.*;
import java.util.ArrayList;

public class GenericsMain {

    public static void main(String[] args) {
        //Car car = new Car();
        GenericBox<String> stringGeneric = new GenericBox<>("oriceString");
        System.out.println(stringGeneric);

        Person person1 = new Person(177);
        Person person2 = new Person(205);
        Person person3 = new Person(162);
        person3.setHeight(165);


        if (person1.compareTo(person2) > 0) {
            System.out.println("Person 1 is taller than Person 2");
        } else {
            System.out.println("Person 2 is taller than Person 1");
        }

        if (person1.compareTo(person3) > 0) {
            System.out.println("Person 1 is taller than Person 3");
        } else {
            System.out.println(" Person 3 is taller than Person 1");
        }

        ex2();
    }

    // Exercitiul 2 din Java Advanced Features pagina 61
    public static void ex2() {
        Integer e = 200;
        ArrayList<GenericBox> arrayList = new ArrayList<>();
        arrayList.add(new GenericBox<>("string"));
        arrayList.add(new GenericBox<Integer>(100));
        arrayList.add(new GenericBox<Double>(10.28));

        for (GenericBox box : arrayList) {
            System.out.println(box);
        }

    }

}



