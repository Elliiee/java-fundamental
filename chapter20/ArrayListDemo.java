package chapter20;
import java.util.*;
class ArrayListDemo {
    public static void main(String[] args){
        //List is an interface 
        //ArrayList class extends AbstractList 
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Initialize size of al: " + al.size());

        al.add("B");
        al.add("X");
        al.add(1, "C");
        //al.addFirst("A");
        al.add("D");
        al.add("Y");
        al.add("Z");

        System.out.println("Contents of al: " + al);

        al.remove("Y");
        al.remove(3);
        //al.removeLast();

        System.out.println("Size of al after deletions: " + al.size());
        //System.out.println("Contents of al, in reverse order: " + al.reversed());

        String[] arr = new String[al.size()];
        arr = al.toArray(arr);
        System.out.println(arr);
    }
}
