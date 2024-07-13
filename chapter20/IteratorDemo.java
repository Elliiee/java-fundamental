package chapter20;
import java.util.*;
class IteratorDemo {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        //use iterator to display contents of al
        System.out.print("Original contents of al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //user listiterator to display
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()){
            String element = litr.next();
            litr.set(element + "+");
        }

        System.out.print("Modified contents of al: ");
        itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //now display the list backwords
        System.out.print("Modified list backwards: ");
        while (litr.hasPrevious()){
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
