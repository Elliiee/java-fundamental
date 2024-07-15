package chapter20;
import java.util.*;
class MyComp implements Comparator<String>{
    public int compare(String astr, String bstr){
        return bstr.compareTo(astr);
    }
}