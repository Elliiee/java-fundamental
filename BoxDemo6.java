public class BoxDemo6 {
    public static void main(String[] args){
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        double vol;

        vol = myBox1.volume();
        System.out.println("volume 1 is " + vol);

        vol = myBox2.volume();
        System.out.println("volume 2 is " + vol);
    }
}
