package chapter18;
//Demonstrate replace 
class replaceDemo {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("This is a test.");
        sb.replace(5, 7, "was was");
        System.out.println(sb);
    }
}
