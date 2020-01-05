package collections;

import java.awt.*;
import java.util.*;
import java.util.List;

public class SetClass {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("yellow");
        colors.add("green");
        colors.add("yellow");
        colors.add("red");
        colors.add("pink");
        colors.add("grey");



        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();
        colors.remove("pink");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        Collections.sort(new ArrayList<>(colors));
        //printCollection(colors);


    }

}
