// public class exceptionhandling {
//     public static void main(String[] args) throws Exception {
//         int a=1,b=0;
//         try{
//             if(b==0){
//                 throw new Exception("error");}
//             System.out.println(a/b);}
//         catch(Exception e){
//             System.out.println(e.getMessage());}
//             finally{
//                 System.out.println("hogya");}}}

class B extends Exception{
    B(String m){
        super();
        System.out.println(m);}}
public class exceptionhandling {
    public static void main(String[] args)throws B {
        int a=1,b=0;
        try{
            if(b==0){
                throw new B("error");}
            System.out.println(a/b);}
        catch(B e){
            System.out.println(e.getMessage());}
            finally{
                System.out.println("hogya");}}}
        