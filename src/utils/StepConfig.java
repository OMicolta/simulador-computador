package utils;

public class StepConfig extends Thread {
    public void run() {
        for(int i=1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
            }
        }
    }
}
