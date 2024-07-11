package chapter15;

class ConstructorRefDemo {
    public static void main(String[] args){
        /*
         * create a reference to the MyClass constructor
         * because func() in MyFunc4 takes an argument, new
         * refers to the parameterized constructor in MyClass
         * not the default  constructor
         */
        MyFunc4 myClassCons = MyClass::new;

        //create an instance of MyClass via that constructor reference.
        MyClass mc = myClassCons.func(100);

        //use the instance of MyClass just created 
        System.out.println("val in mc is " + mc.getVal());
    }
}
