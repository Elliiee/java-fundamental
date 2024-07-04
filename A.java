class A {
    //a simple example of inheritance 
    //create a superclass
    int i, j; 

    void showij(){
        System.out.println("i and j: " + i + " " + j);
    }

    A(){
        System.out.println("inside A's constructor.");
    }

    A(int a, int b){
        i = a; 
        j = b;
    }

    void show(){
        System.out.println("i and j: " + i + " " + j);
    }

    void callme(){
        System.out.println("inside A's callme method.");
    }
}
