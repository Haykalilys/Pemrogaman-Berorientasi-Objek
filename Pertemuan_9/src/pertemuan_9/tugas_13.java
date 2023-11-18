package pertemuan_9;

class MyThread extends Thread {
    public void run(){
            System.out.println("Throwing in" + " MyThread");
            throw new RuntimeException();
        }
    }
public class tugas_13 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) {
            System.out.println(("Caught it " + e));
        }
        System.out.println("Exiting main");
    }
}
