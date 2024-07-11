package chapter15;

class GenericMethRefDemo {
    /*
     * This method has the MyFunc functional interface as the 
     * type of its first parametr. The other two paramters 
     * receive an array and a value, both of type T. 
     */
    static <T> int myOp(MyFunc3<T> f, T[] vals, T v){
        return f.func(vals, v);
    }

    public static void main(String[] args){
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"One", "Two", "Three", "Two"};
        int count; 
        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("vals contains " + count + " 4s");
        count = myOp(MyArrayOps::<String>countMatching, strs, "Two");
        System.out.println("stra contains " + count + " Twos");
    }
}
