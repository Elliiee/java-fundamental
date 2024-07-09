package chapter10;

public class Exc2 {
    public static void main(String[] args){
        int d, a;

        try{
            d = 0;
            a = 42;
            System.out.println("this will not be printed.");
        } catch(ArithmeticException e){
            System.out.println("Division by zero. error");
        }

        System.out.println("After catch statement.");
    }
}
