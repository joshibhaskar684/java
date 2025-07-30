class A{
    int sum (int a, int b, int c){
        return a+b+c;
    }
    void sum (int a, int b){
        System.out.println(a+b);
    }
}
public class overloading {
    public static void main(String[] args) {
        A a= new A();
        System.out.println(a.sum(1,2, 3));
        a.sum(1, 1);
    }
}
