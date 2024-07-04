class B extends A{
    //create a subclass by extending class A
    int i; //this i hides the i in A 
    int k;

    B(){
        super.i = -1; 
        super.j = -1;
        i = -1;
        k = -1; 
        System.out.println("inside B's constructor.");
    }

    B(int a, int b){
        super.i = a; // i in A 
        i = b; // i in B
    }

    B(int a, int b, int c){
        super(a, b);
        k = c; 
    }

    //override show() in A
    void show(){
        super.show();
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
        System.out.println("k: " + k);
    }

    void showk(){
        System.out.println("k: " + i);
    }

    void sum(){
        System.out.println("i+j+k: " + (i+j+k));
    }

    //override A's callme()
    void callme(){
        System.out.println("inside B's callme method.");
    }
}
