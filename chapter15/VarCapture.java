package chapter15;

class VarCapture {
    public static void main(String[] args){
        int num = 10;
        MyFunc myLambda = (n) -> {
            int v = num + n; //this is ok, it does not change num
            //num++; //this is not ok!
            return v;
        };
        //also cause error
        //it would remove the effectively final status from num
        //num = 9;
        System.out.println(myLambda.func(10));
    }
}
