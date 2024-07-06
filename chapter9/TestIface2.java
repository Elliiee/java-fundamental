package chapter9;

class TestIface2 {
    public static void main(String[] args){
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob; // c now refers to AnotherClient object
        //so it can access the methods outside the interface now 
        c.callback(42);
    }
}
