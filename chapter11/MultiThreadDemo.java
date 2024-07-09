package chapter11;

class MultiThreadDemo {
    public static void main(String[] args){
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");

        //start 3 threads
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try{
            //wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Main thread Interupted");
        }
        System.out.println("Main thread exiting");
    }
}
