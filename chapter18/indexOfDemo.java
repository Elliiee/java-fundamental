package chapter18;

class indexOfDemo {
    public static void main(String[] args){
        String s = "Now is the time for all good men to come to the aid of their country.";

        System.out.println(s);

        System.out.println("indexOf('t') = " + s.indexOf('t'));

        System.out.println("lastInndexOf('t') = " + s.lastIndexOf('t'));

        System.out.println("indexOf('the') = " + s.indexOf("the"));

        System.out.println("lastInndexOf(the) = " + s.lastIndexOf("the"));

        System.out.println("indexOf('t', 10) = " + s.indexOf('t', 10));

        System.out.println("lastInndexOf('t', 60) = " + s.lastIndexOf('t', 60));

        //System.out.println("indexOf('the', 3, 47) = " + s.indexOf("the", 3, 47));

        StringBuffer sb = new StringBuffer("one two one");
        int i; 

        i = sb.indexOf("one");
        System.out.println("First index: " + i);

        i = sb.lastIndexOf("one");
        System.out.println("Last index: " + i);
    }
}
