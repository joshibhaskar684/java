
public class t{
    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        if(p.equals(up)){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    public static String trt(String emp,String ful){
        if(ful.isEmpty()){
            System.out.println(emp);
            return "";
        }
        char ch=ful.charAt(0);
        if(ch=='a'){
            return trt(emp,ful.substring(1));

        }
        else{
            return trt(emp+ch,ful.substring(1));
        }
    }
    public static String ski(String d){
        if(d.isEmpty()){
            
            return d;
        }
        // char ch=d.charAt(0);
        if(d.startsWith("Apple")){
            return ski(d.substring(5));
        }
        else{
            return d.charAt(0)+ski(d.substring(1));
        }
    }
    public static String skipapp(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("App")&&!s.startsWith("Apple")){
            return skipapp(s.substring(3));
        }
        else{
            return s.charAt(0)+skipapp(s.substring(1));
        }
    }
    public static void main(String[] args) {
        skip("", "baccdah");
        trt("", "baghccdah");
        String c1="Ravi nikil pawan";
        System.out.println(c1);
        String c2=c1.substring(5);
        System.out.println(c2);
        String c3=c2.substring(6);
        System.out.println(c3);
        System.out.println(ski("RaviApplekahataha"));
        System.out.println(skipapp("RaviAppkahataha"));
    }
}