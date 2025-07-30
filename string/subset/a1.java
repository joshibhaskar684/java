import java.lang.reflect.Array;
import java.util.*;
public class a1 {
    public static ArrayList<String> subse(String es,String fs){
        if(fs.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
           list.add(es);
            return list;
        }
    
        char ch=fs.charAt(0);
        ArrayList<String> left=subse(es+ch,fs.substring(1));
        ArrayList<String> right=subse(es,fs.substring(1));
    left.addAll(right);
    return left;
    }
    public static void main(String[] args) {
        System.out.println(subse("", "abc"));
    }
}
