class A{
    A(int a){
        System.out.println("cns hu");
    }
    void a(){
        System.out.println("baap hu");
    }
}
class B extends A{
    B(int a) {
        super(a);
    }
    void c(){
        super.a();
        System.out.println("beta hu");
    }
}
public class supe {

    public static void main(String[] args) {
        B b = new B(1);
        b.c();
    }
}
