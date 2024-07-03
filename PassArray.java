/*
 * use an array to pass a variable number of 
 * arguments to a method. This is the old-style
 * approach to variable-length arguments. 
 */
public class PassArray {
    static void valTest(int[] v){
        System.out.println("number of args: " + v.length + " contents: ");
        for (int x : v){
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        //notice how an array must be created to 
        //hold the arguments. 
        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] n3 = {};

        valTest(n1);
        valTest(n2);
        valTest(n3);
    }
}
