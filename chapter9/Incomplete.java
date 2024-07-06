package chapter9;

//if the class does not implement interface's method
//it has to be abstract
abstract class Incomplete implements Callback{
    int a, b;

    void show(){
        System.out.println(a + " " + b);
    }
    //...
}
