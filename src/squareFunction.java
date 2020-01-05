/* Create and implement an algorithm that finds the zero place
of the square function f(x) = ax2+bx+c.
 */
import java.util.Scanner;

public class squareFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Double[] result = quadraticEquation(a, b, c);
        if (result == null) {
            System.out.println("There is no real roots for x");
        } else {
            for (Double d : result) {
                System.out.println("value for x:" + d);
            }
        }

    }

    public static Double[] quadraticEquation(int a, int b, int c) {
        Double[] arr = new Double[2];
        if (a == 0) {
            System.out.println("The function is linear !");
        } else {
            if ((b * b - (4 * a * c)) < 0) {
                return null;
            } else {
                arr[0] = (-b + Math.sqrt((b * b - 4 * a * c))) / 2 * a;
                arr[1] = (-b - Math.sqrt((b * b - 4 * a * c))) / 2 * a;
            }
        }
        return arr;
    }
}


