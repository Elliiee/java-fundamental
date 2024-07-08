package chapter9;

public interface MyIfIf {
    //this is a normal interferface method
    int getNumber();

    //this is a default implementation
    // keyword -- default 
    //so if the class implements the interface it does not need to implement it 
    //it can use this method as default 
    default String getString(){
        return "Default String";
    }
}
