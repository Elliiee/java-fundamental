package chapter11;

class NewThread2 extends Thread{
    //create a new second thread 
    NewThread2(){
        super("Demo Thread");
        System.out.println("Child thread: " + this);
    }

    //this is the entry point for the second thread
    public void run(){
        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
