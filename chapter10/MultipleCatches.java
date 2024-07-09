package chapter10;

class MultipleCatches {
    public static void main(String[] args){
        try{
            int a = args.length;
            System.out.println(
                "a = " + a
            );
            int b = 42 /a; //error if no command line args 
            int[] c = {1}; //not going to reach here 
            c[42] = 99; //out of bound error
        } catch (ArithmeticException e){
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("after try/catch blocks.");
    }
}
