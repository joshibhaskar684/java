class A extends Thread{
public void run(){
    System.out.println("thread extends");}}
    class B implements Runnable{
        public void run(){
            System.out.println("thread implement");}}
public class threadingintwoways {
    public static void main(String[] args) {
        A a=new A();
        a.start();
        Thread t =new Thread(new B());
        t.start();}}
