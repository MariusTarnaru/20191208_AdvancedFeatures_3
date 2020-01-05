
/* Create and implement an algorithm thatt finds the zero place
of the linear function f(x) = ax + b
 */
public class LinearFunction {

    static void linearFunction(double a, double b){
        double f;
        if(a != 0 && b != 0 ){
            f = (-b / a);
            System.out.println("Zero place of linear function is: " + f);;
        }else{
            if (b != 0 ){
                System.out.println("Linear function don't have zero place ! ");
            }else{
                f = 0;
                System.out.println("Zero place of linear function is: " + f);
            }
        }
    }
    public static void main(String[] args) {
        linearFunction(0,6);
        linearFunction(12,0);
        linearFunction(34,6);
        linearFunction(6,66);
    }

}
