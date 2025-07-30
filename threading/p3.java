public class p3{
    public static void main(String[] args) throws InterruptedException {
        mythread m=new mythread();
        // System.out.println(m.getName());
        // m.setName("FIRST BORN");
        // System.out.println(m.getName());
        m.start();
        System.out.println(m.isAlive());
            m.join();
            System.out.println(m.isAlive());
        // System.out.println(Thread.currentThread().getName());
        // Thread.currentThread().setName("loser");
        // System.out.println(Thread.currentThread().getName());

    }
}
class mythread extends Thread{
    public void run(){
        System.out.println("Thread is running");
        for(int i=0;i<5;i++){
            System.out.println("Thread is running "+i);
            try{
                Thread.sleep(1000);
                }
                // catch( Exception e){System.out.println("Exception caught");
                catch(Exception e){
                    System.out.println("Thread Exception caught"+e);

                }
            }

        }
    }