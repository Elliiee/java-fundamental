package chapter19;
//Demonstrate thread groups.
class NewThread extends Thread{
    boolean suspendFlag;

    NewThread(String threadname, ThreadGroup tgOb){
        super(tgOb, threadname);
        
    }
}
