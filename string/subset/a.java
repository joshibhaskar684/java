
public class a {
    public static void subse(String es,String fs){
        if(fs.isEmpty()){
            System.out.println(es);
            return ;
        }
    
        char ch=fs.charAt(0);
        subse(es+ch,fs.substring(1));
        subse(es,fs.substring(1));
    
    }
    public static void main(String[] args) {
        subse("","abc");

    }
    
}
