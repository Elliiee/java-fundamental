package chapter12;

class AutoBox2 {
    //take an Integer parameter and return an int value. 
    //auto unbox 
    static int m(Integer v){
        return v; 
    }

    public static void main(String[] args){
        //auto box 
        Integer iob = 100;
        System.out.println(iob);
    }
}
