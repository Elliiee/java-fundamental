package chapter8;

class DemoBoxWeight {
    public static void main(String[] args){
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076); 
        double vol;

        vol = mybox1.volume();
        System.out.println(vol);
        System.out.println(mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println(vol);
        System.out.println(mybox2.weight);
        System.out.println();
    }
}
