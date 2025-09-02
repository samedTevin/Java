public class ChronometerThread implements Runnable{

    private Thread thread;
    private String threadName;

    public ChronometerThread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating : " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running : " + threadName);

        try{
            for (int i = 1; i <= 10; i++){
                System.out.println(threadName + ":" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Cut : " + threadName);
        }

        System.out.println("Thread has finished : " + threadName);
    }

    public void start(){
        System.out.println("Thread object is being creating");
        if(thread == null){
            thread = new Thread(this,threadName); // this means whole class
            thread.start();
        }
    }
}
