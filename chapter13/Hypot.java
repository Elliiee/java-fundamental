package chapter13;

//compute the hypotenuse of a right triangle.
class Hypot {
    public static void main(String[] args){
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        //use class name to call the static method Math.pow() and Math.sqrt()
        hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("Hypotenuse is: " + hypot);
    }
}
