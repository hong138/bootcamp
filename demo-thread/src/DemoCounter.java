
import java.util.concurrent.atomic.AtomicInteger;

public class DemoCounter {
  private static int counter = 0;
  // counter++ -> non-atomic
  private static int counter2 = 0;

  // For Solution 1
  private static int counter3 = 0;

  // For Solution 2
  private static AtomicInteger counter4 = new AtomicInteger(0);

  // !!! This is a private room allowing one thread at the same time
  public static synchronized void increment() {
    counter3++;
  }


  public static void main(String[] args) {
    // 2 threads (Share resource)

    // Example 1: Write & Read

    // count++ (1000 times) (Thread 1)
      // Lambda - Runnable for task1
      Runnable task1 = () -> {
        for (int i = 1; i <= 100000; i++) {
          counter++; 
        }
    };
    Thread thread1 = new Thread(task1);
    thread1.start();

    // get Counter (Thread 2)
      // Lambda - Runnable for task2
    Runnable task2 = () -> System.out.println("Counter: " + counter);
    Thread thread2 = new Thread(task2);
    thread2.start();

    // ! Example 2 : Write % Write
    // How about 2 threads also write at the same time?
    // task3
    Runnable task3 = () -> {
      for (int i = 0; i < 100000; i++) {
        counter2++; 
      }
      System.out.println("Task 3 completed.");
    };
    Thread thread3 = new Thread(task3);
    thread3.start();

    // task4
    Runnable task4 = () -> {
      for (int i = 0; i < 100000; i++) {
        counter2++; 
      }
      System.out.println("Task 4 completed.");
    };
    Thread thread4 = new Thread(task4);
    thread4.start();

    try {
      // main thread is waiting ... for thread 3 & 4 complete
        thread3.join();
        thread4.join();
        System.out.println(counter2); // !!! !=20000
    } catch (InterruptedException e) {
    }
    // counter = 2000

    // Solution 1: Synchronized
    Runnable task5 = () -> {
      for (int i = 0; i < 100000; i++) {
        DemoCounter.increment(); // synchronized -> "lock the increment method"
      }
    };
    Thread thread5 = new Thread(task5);
    Thread thread6 = new Thread(task5);
    thread5.start();
    thread6.start();
    try {
      thread5.join();
      thread6.join();
    } catch (InterruptedException e) {
    }
    System.out.println("Counter3 = " + counter3); // 200000


    // Solution 2: AtomicInteger
    Runnable task6 = () -> {
      for (int i = 0; i < 100000; i++) {
        // !!! Atomic Operation
        counter4.incrementAndGet(); // similar to ++ operation
      }
    };
    Thread thread7 = new Thread(task6);
    Thread thread8 = new Thread(task6);
    thread7.start();
    thread8.start();
    try {
      thread7.join();
      thread8.join();
    } catch (InterruptedException e) {
    }
    System.out.println("Counter4 = " + counter3); // 200000

    System.out.println("Main method end...");

  }
}
