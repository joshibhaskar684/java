interface A{
    void d();
}
interface B{
    void e();
}
interface D extends B{
    public void a();
}
class C implements A,B{
    public void d(){
    System.out.println("d");
    }
    public void e(){
        System.out.println("e");
    }
}
class E implements B,D{
    public void a()
    {
        System.out.println("a");
    }
    public void e(){
        System.out.println("e");
    }
}
public class multipleinheritance {
    public static void main(String[] args) {
        C c =new C();
        c.e();
        c.d();
        E e =new E();
        e.a();
        e.e();
    }
}
