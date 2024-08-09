package chapter8;

//a superclass variable can reference a subclass object 
class RefDemo {
    public static void main(String[] args){
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println(vol);
        System.out.println(weightbox.weight);
        System.out.println();

        plainbox = weightbox; //左边是superclass, 右边是subclass
        vol = plainbox.volume();
        System.out.println(vol);
        //System.out.println(plainbox.weight); //error, weight variable only exists in subclass, while
        //plainbox is a superclass, which can be referenced to a subclass like here, but it is still
        //a superclass, remember!
    }
}
