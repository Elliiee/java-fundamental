package chapter9;

//Define an integer stack interface 

interface IntStack {

    void push(int item);

    int pop();

    default void clear(){
        System.out.println("clear() not implemented");
    }
}
