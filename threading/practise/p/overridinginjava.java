class A{
    public void m(){
        System.out.println("um");
    }
}
class B extends A{
    @Override
    public void m(){
        System.out.println("sm");    }
}
public class overridinginjava {
    public static void main(String[] args) {
        // A a=new A();
        // a.m();
        // B b= new B();
        // b.m();
        A o = new B();
        o.m();

    }
}
