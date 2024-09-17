
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoVector {
  // private List<String> name = new ArrayList<>();

  // Solution 1
  // private List<String> name = new Vector<>(); // Vector.add() differ to ArrayList.add()

  private List<String> name = Collections.synchronizedList(new ArrayList<>()); 

  private static ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 0);

  public List<String> getName() {
    return this.name;
  }

  public static void main(String[] args) throws InterruptedException {
    DemoVector demo = new DemoVector();
    Runnable addName = () -> {
      for (int i = 0; i < 1000000; i++) {
        threadLocalValue.set(threadLocalValue.get() + 1); 
        demo.getName().add("x");
      }
      System.out.println("Thread Name=" + Thread.currentThread().getName() + ", local value=" + threadLocalValue.get());
    };

    Thread thread1 = new Thread(addName);
    Thread thread2 = new Thread(addName);
    thread1.start();
    thread2.start();

    thread1.join(); // main thread will stop here to wait for thread1 completes
    thread2.join(); // main thread will stop here to wait for thread2 completes
    
    System.out.println(demo.getName().size());

    // try {
    //   thread1.join();
    //   thread2.join(); 
    // } catch (InterruptedException e) {
      
    // }

    Thread thread3 = new Thread(addName);
    thread3.run();
  }
}
