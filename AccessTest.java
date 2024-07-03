public class AccessTest {
    public static void main(String[] args){
        Test ob = new Test();

        //these are ok, a and b may be accessed directly. 
        ob.a = 10;
        ob.b = 20;

        //this is not ok, can't access c 
        //ob.c = 100; //will throw error 

        ob.setc(100); //this is the correct way to set c 
        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
