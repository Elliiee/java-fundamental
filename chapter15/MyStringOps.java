package chapter15;
//This class defines a static method called strReverse().
class MyStringOps {
    String strReverse(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }
}
