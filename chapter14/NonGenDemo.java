package chapter14;

class NonGenDemo {
    public static void main(String[] args){
        NonGen iob;
        iob = new NonGen(88);
        iob.showType();
        int v = (int) iob.getOb(); //need cast type 
        System.out.println("value: " + v);
        System.out.println();

        NonGen strob = new NonGen("Non-Generics Test");
        strob.showType();
        String str = (String) strob.getOb();
        System.out.println("Value: " + str);

        //this is error 
        //iob = strob;
        //v = (Integer) iob.getOb();
    }
}
