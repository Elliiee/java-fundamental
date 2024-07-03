public class OverloadCons2 {
    public static void main(String[] args){
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);

        //create copy of mybox1
        Box myclone = new Box(myBox1);

        double vol;

        vol = myBox1.volume();
        System.out.println("volume of mybox1 is " + vol);

        vol = myBox2.volume();
        System.out.println("volume of mybox2 is " + vol);

        vol = myBox3.volume();
        System.out.println("volume of mybox3 is " + vol);

        vol = myclone.volume();
        System.out.println("volume of myclone is " + vol);
    }
}
