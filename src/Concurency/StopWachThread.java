package Concurency;

public class StopWachThread extends Thread {
    private String prexif;

    public StopWachThread(String prexif) {
        this.prexif = prexif;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(prexif + " :Stop watch: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
