package chapter10;

class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = { 1, 2, 3 };
        try {
            int result = a / b; // generate an AritchmeticException
            vals[10] = 19; // generate an ArrayIndexOutOfBoundException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("After multi-catch.");
    }
}
