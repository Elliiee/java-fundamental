package chapter9;

class Client implements Callback{
    //implement interface method
    public void callback(int p){
        System.out.println("callback called with " + p);
    }

    //add more method
    void nonIfaceMeth(){
        System.out.println("classes that implement interfaces" +
                            "may also define other members, too");
    }
}
