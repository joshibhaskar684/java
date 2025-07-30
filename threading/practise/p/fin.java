final class A{
    public void a(){
        System.out.println("hii");
    }
}
// class B extends A{
// cant do it 
// final method cant eb overriden
// }

public class fin {
    public static void main(String[] args) {
        A a = new A();
        a.a();
    }
}
