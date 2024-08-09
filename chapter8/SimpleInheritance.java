package chapter8;

class SimpleInheritance {
    public static void main(String[] args){
        A superOb = new A();
        B subOb = new B();

        //the superclass may be used by itself. 
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        //the subclass can access to all public members 
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Sum of i, j, and k in subOb: ");
        subOb.sum();
    }
}
