
import java.io.IOException;

public class DemoStringBuilder {
  private static Appendable sb = new StringBuffer("");

  // append() -> non-atomic

  // Solution : StringBuffer

  public static void append(Appendable sb, String value){
    try {
      sb.append(value);
    } catch (IOException e) {
    }
  }

  public static void main(String[] args) {
  long before = System.currentTimeMillis();

  Runnable task1 = () -> {
    for (int i = 0; i < 100000000; i++) {
      append(sb, "1");
    }
  };
  Thread thread1 = new Thread(task1);
  thread1.start();

  Runnable task2 = () -> {
    for (int i = 0; i < 100000000; i++) {
      append(sb, "2");
    }
  };
  Thread thread2 = new Thread(task2);
  thread2.start();

  try {
      thread1.join();
      thread2.join();
  } catch (InterruptedException e) {
  }
  System.out.println(sb.toString().length());
  long after = System.currentTimeMillis();
  System.out.println("Time: " + (after - before));
  // StringBuffer Times: 525
  // StringBuilder Times: 2433

  }
}
