package chapter20;
//show date and time using only Date methods 
import java.util.*;
class DateDemo {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);

        //display number of milliseconds since midnight, January 1, 1970 GMT
        long msec = date.getTime();
        System.out.println("Milliseconds since Jan. 1, 1970 GMT = " + msec);
    }
}
