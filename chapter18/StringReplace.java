package chapter18;
//Substring replacement
class StringReplace {
    public static void main(String[] args){
        String org = "This is a test. This is, too.";
        String search = "is";
        String sub = "was";
        String result = "";
        int i; 
        do {
            //replace all matching substrings 
            System.out.println(org);
            i = org.indexOf(search);
            if (i != -1){
                result = org.substring(0, i); //add the before replacement 
                result += sub; //replace 
                result += org.substring(i + search.length()); //add the rest 
                org = result; //change the org to the new version 
            }
        } while (i != -1); //until no matched substring founded
    }
}
