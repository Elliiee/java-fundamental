package chapter15;

class MyClass {
    private int val;

    MyClass(int v){
        val = v;
    }

    //default constructor
    MyClass(){
        val = 0;
    }

    int getVal(){
        return val;
    }
}
