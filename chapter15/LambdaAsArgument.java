package chapter15;

class LambdaAsArgument {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args){
        String inStr = "Lambda add power to Java.";
        String outStr;

        System.out.println("Here is input string: " + inStr);
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("The string in uppercase: " + outStr);

        //This passes a block lambda that removes spaces. 
        outStr = stringOp((str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) != ' '){
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);

        System.out.println("The string with spaces removed: " + outStr);

        //it is also possible to pass a StringFunc instance created by an lambda expression
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--){
                result += str.charAt(i);
            }
            return result;
        };

        //now, reverse can be passed as the first parameter to stringOp()
        System.out.println("The string reverse: " + stringOp(reverse, inStr));
    }
}
