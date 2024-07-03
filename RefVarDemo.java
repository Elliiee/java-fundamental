public class RefVarDemo {
    public static void main(String[] args){
        var mc = new MyClass(10); //local variable type with created class object 

        System.out.println("value of i in mc is " + mc.geti());
        mc.seti(19);
        System.out.println("value of i in mc is now " + mc.geti());
    }
}
