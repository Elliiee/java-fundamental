package chapter11;

class ExtendThread {
    public static void main(String[] args){
        NewThread2 nt = new NewThread2();

        nt.start(); //start the thread 

        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Main interrupted.");
        }
        System.out.println("Exiting main thread.");
    }
}
