package Concurency;

public class HelloThread implements Runnable {
    private int value;
    private int counter;

     public HelloThread(int value) {
         this.value = value;
     }
    public synchronized void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }


    @Override
    public void run() {
        while (true) {
            if (counter == 10) {
                break;
            }
            System.out.println("Hello! " + counter + "!");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (counter < 10) {
                increment();
                System.out.println(Thread.currentThread().getName()+ " incremented");
                System.out.println("Counter is: " + counter);
            } else {
                decrement();
                System.out.println(Thread.currentThread().getName() + " decremented");

            }
        }
    }
}

