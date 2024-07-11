package chapter15;

class MethodRefDemo2 {
    //this method has a functional interface as the type of the first parameter 
    //Thus, it can be passed any instance of that interface, including method references. 
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args){
        String inStr = "Lambda add power to Java.";
        String outStr;

        //create MyStringOps object. 
        MyStringOps strOps = new MyStringOps();

        //Now, a method reference to the instance method strReverse is passed to stringOp()
        outStr = stringOp(strOps::strReverse, inStr);
        System.out.println("original string: " + inStr);
        System.out.println("reversed string: " + outStr);
    }
}
