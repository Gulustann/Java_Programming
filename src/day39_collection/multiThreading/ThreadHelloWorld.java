package day39_collection.multiThreading;

public class ThreadHelloWorld extends Thread{//or implements Runnable
int threadNumber;
public  ThreadHelloWorld(int threadNumber){
    this.threadNumber=threadNumber;
}

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello World " +i+" from Thread "+ threadNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }





}
