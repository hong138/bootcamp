import java.util.Arrays;
import java.util.Scanner;

public class JavaQuest10 {
  public static void main(String[] args) {
    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    int[] newArr = new int [my_array.length];

    for (int i = 0; i < newArr.length; i++) {
        if (i == indexPosition){
          newArr[i] = newValue;
        } else if (i < indexPosition){
          newArr[i] = my_array[i];
        } else{
          newArr[i] = my_array[i - 1];
        }
    }
    System.out.println("New Array: " + Arrays.toString(newArr));
    


    // my_array = newArr;
    
  }
}
