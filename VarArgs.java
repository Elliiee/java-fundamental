//demonstrate variable-length arguments 

public class VarArgs {
    static void valTest(int ... v){
        System.out.println("number of args: " + v.length + " contents: ");
        for (int x : v){
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        //notice how an array must be created to 
        //hold the arguments. 
        //int[] n1 = {10};
        //int[] n2 = {1, 2, 3};
        //[] n3 = {};

        valTest(10);
        valTest(1, 2, 3);
        valTest();
    }
}
