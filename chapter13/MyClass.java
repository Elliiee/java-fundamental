package chapter13;

class MyClass {
    int a; 
    int b;

    MyClass(){
        this(0); //invoke the next constructor 
    }

    MyClass(int i){
        this(i, i); //invoke the next constructor
    }

    MyClass(int i, int j){
        a = i;
        b = j;
    }
}
