package chapter14;

class Gen22<T> extends Gen<T> {
    Gen22(T o){
        super(o);
    }

    //override getOb()
    T getOb(){
        System.out.println("Gen2's getOb(): ");
        return ob;
    }
}
