import java.util.*;
public class findallpossiblepermutationofno{
    //using normal method
    public static void per(String em,String fu){
        if (fu.isEmpty()) {
            System.out.println(em);
            return;
        }
        for(int i=0;i<fu.length();i++){
            String newfu=fu.substring(0,i)+fu.substring(i+1,fu.length());
            per(em+fu.charAt(i),newfu);
        }
       }
       //using arraylist
       public static ArrayList<String> per1(String e,String f){
        ArrayList<String> result=new ArrayList<>();
        if (f.isEmpty()) {
           result.add(e);
            return result;
        }
        for(int i=0;i<f.length();i++){
            String newf=f.substring(0, i)+f.substring(i+1,f.length());
           ArrayList<String> temp=per1(e+f.charAt(i),newf);
           result.addAll(temp);
        }
        return result;
        

       }
    public static void main(String[] args) {
        String s="abc";
        // System.out.println(s.substring(1,1));
        per("",s);
        System.out.println(per1("","abc"));
    }
}