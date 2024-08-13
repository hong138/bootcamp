public class JavaQuest11 {
  public static void main(String[] args) {
    int delayedArrivalTime1 = findDelayedArrivalTime(15, 5); // 20
    int delayedArrivalTime2 = findDelayedArrivalTime(23, 5); // 4
    int delayedArrivalTime3 = findDelayedArrivalTime(18, 6); // 0
  }

  public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    int delayedArrivalTime = (arrivalTime + delayedTime) % 24;
    return delayedArrivalTime;
  }
}
