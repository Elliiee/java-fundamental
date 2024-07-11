package chapter14;

class OverrideDemo {
    public static void main(String[] args){
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen22<Integer> iOb2 = new Gen22<Integer>(99);
        Gen22<String> strOb2 = new Gen22<String>("Generic Test");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}
