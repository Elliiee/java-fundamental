package chapter20;
//Demonstrate LinkedList 
import java.util.*;
class LinkedListDemo {
    public static void main(String[] args){
        //create a linked list 
        LinkedList<String> ll = new LinkedList<>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addFirst("A");
        ll.addLast("Z");
        System.out.println("original list: " + ll);

        ll.remove("F");
        ll.remove(2);
        System.out.println("remove F and then index 2: " + ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll after deleting first and last: " + ll);

        //get and set a value
        String val = ll.get(2);
        ll.set(2, val + " Changed");

        System.out.println("ll after change: " + ll);
    }
}
