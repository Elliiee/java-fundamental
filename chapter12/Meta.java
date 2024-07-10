package chapter12;

import java.lang.reflect.Method;

class Meta {
    //Annotate a method
    @MyAnno (str = "Two Paramters", val = 19)
    public static void myMeth(String str, int i){
        Meta ob = new Meta();

        //obtain the annotation for this method 
        // and display the values of the members.
        try{
            //First, get a class object that represents this class. 
            Class<?> c = ob.getClass();

            //get a method object that represents this method.
            Method m = c.getMethod("myMeth", String.class, int.class);

            //get the annotation for this class 
            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e){
            System.out.println("Method not found.");
        }
    }

    public static void main(String[] args){
        myMeth("test", 10);
    }
}
