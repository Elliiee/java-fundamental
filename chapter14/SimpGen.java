package chapter14;

class SimpGen {
    public static void main(String[] args){
        TwoGen<Integer, String> tgObj = new TwoGen<Integer,String>(88, "Generics");
        tgObj.showType();
        int v = tgObj.getOb1();
        String str = tgObj.getOb2();
        System.out.println("value: " + v);
        System.out.println("value: " + str);
    }
}
