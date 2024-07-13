package chapter18;
//A bubble sort for Strings. 
class SortString {
    static String[] arr = {"Now", "is", "the", "time", "for", "all", "good", "men", 
                            "to", "come", "to", "the", "aid", "of", "their", "country"};
    public static void main(String[] args){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i].compareTo(arr[j]) > 0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]); //inside the first loop
        }
    }
    /*
     * compareTo() taks into account uppercase and lowercase letters. 
     * The word "Now" came before all because it begins with uppercase letter
     * If you want to ignore case differences when comparing two strings, use 
     * compareToIgnoreCase()
     */
}
