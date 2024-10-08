
public class DemoSuper {
    public static void main(String[] args){
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("volume of mybox1 is " + vol);
        System.out.println("weight of mybox1 is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("volume of mybox2 is " + vol);
        System.out.println("weight of mybox2 is " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("volume of mybox3 is " + vol);
        System.out.println("weight of mybox3 is " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("volume of myclone is " + vol);
        System.out.println("weight of myclone is " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("volume of mycube is " + vol);
        System.out.println("weight of mycube is " + mycube.weight);
        System.out.println();
    }
}
