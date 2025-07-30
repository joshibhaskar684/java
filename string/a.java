//subset(permutation and combination)
public class a {
    public static String find(String s){
        if(s.isEmpty()){
            return s;
        }
        if(s.startsWith("big")){
            return s.substring(3);
        }
        else{
            return s.charAt(0)+find(s.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println("d");
        String n="ravi is a big looser";
        System.out.println(find(n));
    }
}
