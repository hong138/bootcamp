// !!! Another way to create thread
public class MyThread extends Thread { // worker

  // Task
  @Override
  public void run() { // Collections.sort() -> comapreTo()
    // start() -> run()
    System.out.println("MyThread is running...");
  }

  @Override
  public void start() {
    
  }
  public static void main(String[] args) {
    int y = 5;
    Thread thread3 = y > 3 ? new MyThread() : new Thread(() -> System.out.println("hello"));
    thread3.start(); // open-close coding style
  }
  
}
