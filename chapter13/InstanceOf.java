package chapter13;

class InstanceOf {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A)
            System.out.println("a is instance of A");
        if (b instanceof B)
            System.out.println("b is instance of B");
        if (c instanceof C)
            System.out.println("c is instance of C");
        if (c instanceof A)
            System.out.println("c can be cast to A");
        if (a instanceof C)
            System.out.println("a can be cast to C");
        
        System.out.println();

        A ob;
        ob = d;
        System.out.println("ob now refers to d");

        if (ob instanceof D)
            System.out.println("ob can be cast to D");
        else
            System.out.println("ob cannot be cast to D");

        if (ob instanceof A)
            System.out.println("ob can be cast to A");
        
        System.out.println();

        //all objects can be cast to object
        if (a instanceof Object)
            System.out.println("a is instance of object");
        if (b instanceof Object)
            System.out.println("b is instance of Object");
        if (c instanceof Object)
            System.out.println("c is instance of Object");
        if (c instanceof Object)
            System.out.println("c can be cast to Object");
    }
}
