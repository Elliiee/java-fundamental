package chapter11;

class NewThread implements Runnable {
    String name; // name of each thread
    Thread t; // instance of Thread class
    boolean suspendFlag; // suspending and resuming a thread in the modern way

    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
    }

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        suspendFlag = false;
    }

    // this is the entry point for the second thread
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println("Child Thread: " + name + " " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted: " + name);
        }
        System.out.println("Exiting child thread:" + name);
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
