// !!! Another way to create a task
public class MyTask implements Runnable{
  @Override
  public void run() {
    System.out.println("MyTask is running...");
  }

  public static void main(String[] args) {
    // !!! You can only put an object implements Runnable
    Thread thread1 = new Thread(new MyTask());
    // !!! If you execute run(), instead of start(), you didn't create one more thread
    // !!! You have main thread only
    thread1.run(); // MyTask is running...
    // !!! You will create another thread once you execute start() method
    // thread1.start();


  }
  
}
