package chapter14;

class GenMethDemo {
    //Determine if an object isn in an array
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for (int i = 0; i < y.length; i++){
            if (x.equals(y[i])){
                return true;
            } 
        }
        return false;
    }

    public static void main(String[] args){
        //use isIn() on Integers. 
        Integer[] nums = {1, 2, 3, 4, 5};

        if (isIn(2, nums)){
            System.out.println("2 is in nums");
        }

        if (!isIn(7, nums)){
            System.out.println("7 is not in nums");
        }

        System.out.println();

        //use isIn() on Strings
        String[] strs = {"One", "Two", "Three", "Four", "Five"};

        if (isIn("Two", strs)){
            System.out.println("Two is in strs");
        }

        if (!isIn("seven", strs)){
            System.out.println("seven is not in strs");
        }

        //error: Types are not compatible. V need to extend T 
        //if (isIn("Two", nums)){
        //    System.out.println("Two is in strs");
        //}
    }
}
