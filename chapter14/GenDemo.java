package chapter14;

//Demonstrate the generic class.
class GenDemo {
    public static void main(String[] args){
        //System.out.println("test");
        //create a Gen reference for Integers
        Gen<Integer> iob = new Gen<Integer>(88); //use Integer 88
        iob.showType();
        int v = iob.getOb();
        System.out.println("value: " + v);
        System.out.println();

        //create a Gen object for type Strings
        Gen<String> strob = new Gen<String>("Generics Test");
        strob.showType();
        String str = strob.getOb();
        System.out.println("value: " + str);
    }
}
