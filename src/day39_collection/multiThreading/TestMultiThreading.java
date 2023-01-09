package day39_collection.multiThreading;

public class TestMultiThreading {
    public static void main(String[] args) {
       ThreadHelloWorld thread1 = new ThreadHelloWorld(1);

//thread 1 and thread2 executed at the same time

        ThreadHelloWorld thread2 = new ThreadHelloWorld(2);


        ThreadHelloWorld thread3 = new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 = new ThreadHelloWorld(4);
        ThreadHelloWorld thread5 = new ThreadHelloWorld(5);

        thread1.start();//all threads being executed concurrently, at the same time
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        //run90 method does not execute concurrently, not at the same time

/*Hello World1
Hello World1
Hello World1
Hello World1
Hello World1
Hello World2
Hello World2
Hello World2
Hello World2.....*/



    }

}
