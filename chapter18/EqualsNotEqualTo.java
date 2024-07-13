package chapter18;
//equals() vs. == 
/*
 * equals() method compares the characters inside a String object. 
 * The == operator compares two object references to see whether they refer to the same instance. 
 */
class EqualsNotEqualTo {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = new String(s1);

        System.out.println("equals(): " + s1.equals(s2));
        System.out.println("== " + (s1 == s2));
        //even thought s2 is initialized with s1, they are 2 different objects. 
    }
}
