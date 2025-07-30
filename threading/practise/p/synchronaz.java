class Counter{
    int count=0;
    // without synchronized
    public  void inc(){
        ++count;
    }
    public int getc(){
        return count;
    }
}
class Counter1{
    int count=0;
    // with synchronized
    public synchronized void inc(){
        ++count;
    }
    public int getc(){
        return count;
    }
}
class A extends Thread{
    Counter c;
    public A(Counter c){
        this.c =c;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            c.inc();
        }
    }
}
class B extends Thread{
    Counter1 c;
    public B(Counter1 c){
        this.c =c;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            c.inc();
        }
    }
}

public class synchronaz {
    public static void main(String[] args) throws Exception{
        // without synchronized
        Counter c= new Counter();
        A a=new A(c);
        a.start();
        A b=new A(c);
        b.start();
        a.join();
        b.join();
        System.out.println(c.getc());

        // WITH SYNCHRONIZED
        Counter1 cc= new Counter1();
        B aa=new B(cc);
    aa.start();
        B bb=new B(cc);
        bb.start();
        aa.join();
        bb.join();
        System.out.println(cc.getc());
    }
}
