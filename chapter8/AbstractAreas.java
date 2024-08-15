package chapter8;

class AbstractAreas {
    public static void main(String[] args){
        //Figure f = new Figure(10, 10); //illegal, abstract class can not have right side initiate.
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref; // this is ok, left side reference is ok 
        
        figref = r; // right side has to be non-abstract subclass 
        System.out.println("figref area: " + figref.area());

        figref = t; 
        System.out.println("figure area: " + figref.area());

    }
}
