package chapter15;

class MethodRefDemo {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args){
        String inStr = "Lambda adds power to Java.";
        //String outStr; 
        //outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Original string: " + inStr);
        //System.out.println("String reversed: " + outStr);
    }
}
