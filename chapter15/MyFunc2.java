package chapter15;
//use an instance method reference with different objects
//a functional interface that takes two reference arguments 
//and returns a boolean result 
interface MyFunc2<T> {
    boolean func(T v1, T v2);
}
