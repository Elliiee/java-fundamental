package chapter14;

//Demonstrate run-time type ID implications of generic class hierarchy. 
class HierDemo3 {
    public static void main(String[] args){
        Gen<Integer> iob = new Gen<Integer>(88);
        Gen<Integer> iob2 = new Gen<Integer>(99);

        Gen<String> strOb2 = new Gen<>("Generics Test");

        if (iob2 instanceof Gen22<?>)
            System.out.println("iob2 is instance of Gen2");
        
        if (iob2 instanceof Gen<?>)
            System.out.println("iob2 is instance of Gen");
        
        System.out.println();
        
        if (strOb2 instanceof Gen22<?>)
            System.out.println("strOb2 is instance of Gen2");
        
        if (strOb2 instanceof Gen<?>)
            System.out.println("strOb2 is instance of Gen");
        
        System.out.println();

        if (iob instanceof Gen22<?>)
            System.out.println("iob is instance of Gen2"); //no 
        
        if (iob instanceof Gen<?>)
            System.out.println("iob is instance of Gen"); //yes
    }
}
