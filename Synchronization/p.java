
public class p {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        mt m=new mt(c);
        mt m1=new mt(c);
        m.start();
        m1.start();
        m.join();
        m1.join();
        System.out.println(c.getCount());

    }
}
class Counter{
    private int count = 0;
    // public synchronized void increment() {
    //     count++;
    //     }
    public  void increment() {
        synchronized (this) {
            count++;
        }
    }
        public int getCount(){
            return count;
        }
}
class mt extends Thread{
    private Counter c;
    mt(Counter c){
        this.c = c;
    }
    public void run(){
        for(int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}