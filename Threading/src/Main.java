
public class Main {
    public static void main(String[] args) {

        ChronometerThread thread1 = new ChronometerThread("thread1");

        ChronometerThread thread2 = new ChronometerThread("thread2");

        ChronometerThread thread3 = new ChronometerThread("thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}