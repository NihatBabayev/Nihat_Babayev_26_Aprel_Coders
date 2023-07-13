package az.coders.chapter1.lesson23;

public class ThreadExample {

    public static  void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new MyThread().start();

        System.out.println("Continue");

        Runnable runnable = () -> {System.out.println("hello");
            System.out.println(Thread.currentThread().getName());
        };
        new Thread(runnable).start();

    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        Thread.currentThread().setName("user defined thread");


        try {
            Thread.currentThread().wait();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());


    }

}

