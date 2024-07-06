package chapter9;

class AnotherClient implements Callback{
    //implement Callback interface
    public void callback(int p){
        System.out.println("another version of callback.");
        System.out.println(("p squared is " + (p*p)));
    }
}
