public class MyDeadlock {
  private Object lock1 = new Object();
  private Object lock2 = new Object();

  public void method1() {
    synchronized (lock1) {
      System.out.println("Entering method1");
      System.out.println("Trying to invoke method2 from method1");
      method2();
    }
  }

  public void method2() {
    synchronized (lock2) {
      System.out.println("Entering method2");
      System.out.println("Trying to invoke method1 from method2");
      method1();
    }
  }
  public static void main(String[] args) {
    MyDeadlock deadlock = new MyDeadlock();

    Thread t1 = new Thread(() -> deadlock.method1());
    Thread t2 = new Thread(() -> deadlock.method2());

    t1.start();
    t2.start();
    System.out.println("Main thread ends");
  }
}