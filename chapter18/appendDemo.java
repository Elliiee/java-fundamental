package chapter18;
//Demonstrate append(). 
class appendDemo {
    public static void main(String[] args){
        String s; 
        int a = 42; 
        StringBuffer sb = new StringBuffer(40); 
        s = sb.append("a = ").append(a).append("!").toString(); //notice toString()!
        System.out.println(s);
    }
}
