package chapter18;
//Demonstrate delete() and deleteCharAt()
class deleteDemo {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("This is a test.");
        System.out.println(sb);

        sb.delete(4, 7); //start index, end index
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
