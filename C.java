class C extends A{
    C(){
        System.out.println("inside C's constructor");
    }

    //override A's callme()
    void callme(){
        System.out.println("inside C's callme method.");
    }
}
