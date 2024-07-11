package chapter14;
//bounded type
class Stats<T extends Number> {
    T[] nums; //array of Number or subclass 

    Stats(T[] o){
        nums = o;
    }

    double average(){
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    //determine if two averages are the same
    //notice the use of the wildcard
    boolean isSameAvg(Stats<?> ob){
        if (average() == ob.average()){
            return true; 
        }
        return false;
    }
}
