package chapter9;

class IFTest3 {
    public static void main(String[] args){
        IntStack mystack; // create an interface reference variable 
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds; // intialized the interface reference variable 
        for (int i = 0; i < 12; i++) mystack.push(i);

        mystack = fs;
        for (int i = 0; i < 8; i++) mystack.push(i);

        mystack = ds; 
        System.out.println("values in dynamic stack: ");
        for (int i = 0 ; i < 12; i++) System.out.println(mystack.pop());

        mystack = fs; 
        System.out.println("values in fixed stack: ");
        for (int i = 0 ; i < 8; i++) System.out.println(mystack.pop());
    }
}
