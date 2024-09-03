package sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import sorting.formula.BoxSorts;

public class DemoComparable {
  public static void main(String[] args) {
    int[] arr = new int[] {4, 90, 64};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr)); // [4, 64, 90]

    int[] arr2 = new int[] {33, 87, -56, 20};
    Arrays.sort(arr2, 1, arr2.length);
    System.out.println(Arrays.toString(arr2)); // [33, -56, 20, 87]

    // How about reverse order
    List<Box> boxes = new ArrayList<>();
    boxes.add(new Box(3));
    boxes.add(new Box(-3));
    boxes.add(new Box(7));
    boxes.add(new Box(64));
    boxes.add(new Box(78));

    Collections.sort(boxes); // sort() -> call your box object's compareTo() method
    // similar to ArrayList remove() -> your object's equals()
    System.out.println(boxes); // [78, 64, 7, 3, -3]

    // Comparator<Box>
    Collections.sort(boxes, BoxSorts.asc()); // ascending
    System.out.println(boxes);
    Collections.sort(boxes, BoxSorts.desc()); // descending
    System.out.println(boxes);


  }
}
 