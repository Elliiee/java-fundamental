public class Outer {
    int outer_x = 100;

    void test(){
        for (int i = 0; i < 10; i++){
            class Inner{
                void display(){
                    //inner class can access outer class variables 
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner(); //inner class instance
            inner.display();
        }

        //Inner inner = new Inner(); //inner class instance
        //inner.display();
    }

    /* 
    class Inner{
        int y = 10; //local variable to the inner class 

        void display(){
            //inner class can access outer class variables 
            System.out.println("display: outer_x = " + outer_x);
        }
    }
    */

    //void showy(){
        //System.out.println(y); //error 
    //}
}
