package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMain {

   /* private static void printCollection(Collection list) {
        for (Object s : list) {
            System.out.println(" " + s);
        }
        System.out.println();
    }*/

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            stringList.add(scanner.nextLine());
        }
        for (String s : stringList) {
            System.out.print(" " + s);
        }
        System.out.println();

        String startWith = scanner.nextLine();
        Iterator<String> it = stringList.iterator();
        while (it.hasNext()) {
            String currentString = it.next();
            if (currentString.startsWith(startWith)) {
                it.remove();
            }
        }
        for (String s : stringList) {
            System.out.print(" " + s);
        }


        String replaceWith = scanner.nextLine();
        stringList.remove("m");
        if(stringList.remove(replaceWith));
            int found = 0;
            for (String s: stringList) {
            System.out.print(" " + s);
        }
            found++;
    }


}
