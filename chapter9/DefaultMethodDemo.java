package chapter9;

class DefaultMethodDemo {
    public static void main(String[] args){
        MyIfImp obj = new MyIfImp();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString()); //default method from the interface 
    }
}
