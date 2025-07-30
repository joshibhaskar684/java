import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class p1 {
    public static void main(String[] args) throws InterruptedException{
        
Queue<Integer> q = new ArrayBlockingQueue<>(10);
        producer p = new producer(q);
        consumer c = new consumer(q);
        p.start();
        c.start();
        
    }
}
class consumer extends Thread{
    Queue<Integer> q ;
   
    public consumer(Queue<Integer> q2) {
        this.q=q2;
    }
    public void run()
{
    while(true){
        System.out.println("Consumer is waiting");
        try {
            
            System.out.println("Consumer is running");
            System.out.println("Consumed: "+q.poll());
            Thread.sleep(1000);
           
            } catch (InterruptedException e) {
                e.printStackTrace();
                }
    }
}
}
class producer extends Thread {
    final Queue<Integer> q ;
    

public producer(Queue<Integer> q2) {
       this.q = q2;
    }

public void run() {
    int value=0;
    while(true){
        try{
            System.out.println("producing");
            ((ArrayBlockingQueue<Integer>) q).put(value++);
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Producer interrupted");
        }

    }
   
}
}