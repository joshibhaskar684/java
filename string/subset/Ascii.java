import java.util.ArrayList;

public class Ascii {
    //using normal function 
    public static void subse(String es,String fs){
        if(fs.isEmpty()){
            System.out.println(es);
            return ;
        }
    
        char ch=fs.charAt(0);
        subse(es+ch,fs.substring(1));
        subse(es,fs.substring(1));
        subse(es+(ch+0),fs.substring(1));
    
    }
    //using arraylist
     public static ArrayList<String> subse1(String es,String fs){
        if(fs.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
           list.add(es);
            return list;
        }
    
        char ch=fs.charAt(0);
        ArrayList<String> left=subse1(es+ch,fs.substring(1));
        ArrayList<String> right=subse1(es,fs.substring(1));
        ArrayList<String> teeda=subse1(es+(ch+0),fs.substring(1));
    
        left.addAll(right);
    left.addAll(teeda);
    return left;
    }
    public static void main(String[] args) {
        char c='a';
        System.out.println(c+0);
        System.out.println((char)(c+1));
        subse("", "abc");
        System.out.println( subse1("", "abc"));
    }
}
