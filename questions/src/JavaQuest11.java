public class JavaQuest11 {
  public static void main(String[] args) {
    int delayedArrivalTime1 = findDelayedArrivalTime(15, 5); // 20
    int delayedArrivalTime2 = findDelayedArrivalTime(23, 5); // 4
    int delayedArrivalTime3 = findDelayedArrivalTime(18, 6); // 0
    int delayedArrivalTime4 = findDelayedArrivalTime(9, 6);

    System.out.println("Delayed Arrival Time 1: " + delayedArrivalTime1);
    System.out.println("Delayed Arrival Time 2: " + delayedArrivalTime2);
    System.out.println("Delayed Arrival Time 3: " + delayedArrivalTime3);
    System.out.println("Delayed Arrival Time 4: " + delayedArrivalTime4);
  }

  public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    int delayedArrivalTime = (arrivalTime + delayedTime) % 24;
    return delayedArrivalTime;
  }
}
