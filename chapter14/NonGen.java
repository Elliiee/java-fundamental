package chapter14;
/*
 * NonGen is functionally equivalent to Gen but does not use generics.
 */
class NonGen {
    Object ob; //ob is not of type object
    int num;

    //pass the constructor a reference to an object of type Object.
    NonGen(Object o){
        ob = o;
    }

    NonGen(int i){
        num = i;
    }

    int getnum(){
        return num;
    }

    //return type Object
    Object getOb(){
        return ob;
    }

    //show type of ob
    void showType(){
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}
