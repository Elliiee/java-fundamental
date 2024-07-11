package chapter15;

class InstanceMethRefDemo {
    //A method that returns the number of occurrences of an object for which 
    //some criteria, as specified by the MyFunc paramter, is true. 
    static <T> int counter(T[] vals, MyFunc2<T> f, T v){
        int count = 0;
        for (int i = 0; i < vals.length; i++){
            if (f.func(vals[i], v)){
                count++;
            }
        }
        return count; 
    }

    public static void main(String[] args){
        int count; 

        //create an array of HighTemp objects. 
        HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(82), 
                                    new HighTemp(90), new HighTemp(89),
                                new HighTemp(89), new HighTemp(91), 
                                new HighTemp(84), new HighTemp(83)};

        //use counter() with arrays of the class HighTemp. 
        //Notice that a reference to the instance method sameTemp() is passed 
        //as the second argument. 
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count + " days had a high of 89");

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println(count + " days had a high less than 89");
    }
}
