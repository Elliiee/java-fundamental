package chapter18;
//String constructors 
class MakeString {
    public static void main(String[] args){
        char[] c = {'J', 'a', 'v', 'a'};
        String s1 = new String(c); //constructor using a char array
        String s2 = new String(s1); //constructor using another String object 
        System.out.println(s1);
        System.out.println(s2);
    }
}
