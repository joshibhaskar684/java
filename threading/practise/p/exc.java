// class A extends Exception {
//     A(){
//         System.out.println(" custom exception caught");
//     }
// }
class B extends Exception{
    public B(String message){
        super(message);
    }
}
public class exc {
    public static void main(String[] args) throws A {
        int b=0;
      int a=1;
        // if(b==0){
        //     throw new A();
        // }
       try{
        if (a==1){
            throw new B("this is error");
        }
       }
       catch(B n){
        System.out.println(n.getMessage());
       }
       finally{
        System.out.println("badi muskil se pakada h ");
       }
    }
}
