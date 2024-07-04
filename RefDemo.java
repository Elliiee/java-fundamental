public class RefDemo {
    public static void main(String[] args){
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("volume of weightbox is " + vol);
        System.out.println("weight of weightbox is " + weightbox.weight);
        System.out.println();

        //assign BoxWeight reference to Box reference
        plainbox = weightbox;

        vol = plainbox.volume();
        System.out.println("volume of plainbox is " + vol);

        //error, plainbox is the instance of the superclass which does not have the weight variable. 
        //System.out.println("weight of plainbox is " + plainbox.weight);
    }
}
