package chapter9;

//B implements the nested interface from A 
class B implements A.NestedIF{
    //must be public for interface method implementation
    public boolean isNotNegative(int x){
        return x < 0 ? false : true;
    }
}
