import java.util.*;

public class findhowmanyarethere {
    //counting permutation 
    public static int per(String em,String fu){
        if (fu.isEmpty()) {
            
            return 1;
        }
        int count =0;
        for(int i=0;i<fu.length();i++){
            String newfu=fu.substring(0,i)+fu.substring(i+1,fu.length());
            count=count+(per(em+fu.charAt(i),newfu));
        }
        return count;
       }
       //using Arraylist
       public static ArrayList<Integer>per1(String em,String fu){
        ArrayList<Integer> res=new ArrayList<>();
        if (fu.isEmpty()) {
            res.add(1);
            return res ;
        }

        
        for(int i=0;i<fu.length();i++){
            String newfu=fu.substring(0,i)+fu.substring(i+1,fu.length());
           ArrayList<Integer> t= per1(em+fu.charAt(i),newfu);
           res.addAll(t);
        }
        return res;
       }
    public static void main(String[] args) {
        per("", "abc");
        ArrayList<Integer> r=per1("","abc");
        System.out.println(r.size());
    }
}
