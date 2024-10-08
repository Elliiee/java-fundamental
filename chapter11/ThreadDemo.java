package chapter11;

class ThreadDemo {
    public static void main(String[] args){
        NewThread nt = new NewThread(); 

        nt.t.start();

        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }

    //a factory method that creates and starts a thread.
    public static NewThread createAndStart(){
        NewThread myThrd = new NewThread();
        myThrd.t.start();
        return myThrd;
    }
}
