public class SimpleInheritance {
    public static void main(String[] args){
        A superOb = new A();
        B subOb = new B(-1, -1);

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("contents of superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("sum of i, j and k in subOb:");
        subOb.sum();

    }
}
