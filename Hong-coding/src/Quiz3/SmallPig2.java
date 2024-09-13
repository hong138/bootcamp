package Quiz3;

public class SmallPig2 {
  public int normalMethod(int n) {
    int[] arr = new int[] {1, 3, 5, 7, 9, 11, 13};

    int total = 0;
    for (int i = 0; i < n; i++) {
      total += arr[i];
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println(SmallPig2.normalMethod(4));
  }
}
