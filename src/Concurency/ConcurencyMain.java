package Concurency;

import static java.lang.Thread.*;

public class ConcurencyMain {

    public static void main(String[] args) throws InterruptedException {
            StopWachThread stopWachThread1 = new StopWachThread("TH1");
            StopWachThread stopWachThread2 = new StopWachThread("TH2");

            stopWachThread1.start();
            stopWachThread2.start();

        System. out . println("Main thread" );
        sleep (2000);
        System.out.println("Main thread is still");
        sleep (2000);
        System. out . println("Main thread ends");

        ex3();

    }
    public static void ex3(){
        Thread th1 = new Thread(new HelloThread(1), "nume1");
        Thread th2 = new Thread(new HelloThread(2));
        Thread th3 = new Thread(new HelloThread(3));
        Thread th4 = new Thread(new HelloThread(4));

        th1.start();
        th2.start();
        th3.start();
        th4.start();

    }
}
