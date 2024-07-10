package chapter12;

class EnumDemo3 {
    public static void main(String[] args){
        //Apple ap; //not used here 

        //display price of Winesap
        System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents.\n");

        //display all apples and prices
        System.out.println("All apple prices:");
        for (Apple a : Apple.values()){
            System.out.println(a + " costs " + a.getPrice() + " cents");
        }
    }
}
