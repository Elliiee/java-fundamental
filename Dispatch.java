public class Dispatch {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.callme(); //call A's version of callme

        r = b;
        r.callme(); //call B's version of callme

        r = c;
        r.callme(); //call C's version of callme

    }
}
