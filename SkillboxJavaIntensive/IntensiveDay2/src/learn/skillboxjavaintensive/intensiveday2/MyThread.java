package learn.skillboxjavaintensive.intensiveday2;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
