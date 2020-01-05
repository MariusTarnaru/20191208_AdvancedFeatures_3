package AdvancedFeatures;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private int height;

    public Person(int height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Person o) {
        if (this.height > o.getHeight()) {
            return 1;
        }
        if (this.height < o.getHeight()) {
            return -1;
        } else {
            return 0;
        }
    }
}

