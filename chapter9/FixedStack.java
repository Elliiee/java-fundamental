package chapter9;

//An implementation of IntStack that uses fixed storage. 
class FixedStack implements IntStack{
    private int[] stck;
    private int tos; 

    //allocate and initialize stack
    FixedStack(int size){
        stck = new int[size];
        tos = -1; 
    }

    public void push(int item){
        if (tos == stck.length -1){
            System.out.println("stack is full");
        } else{
            stck[++tos] = item;
        }
    }

    public int pop(){
        if (tos < 0){
            System.out.println("stack underflow");
            return 0;
        } else{
            return stck[tos--];
        }
    }
}
