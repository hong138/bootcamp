
import java.util.Arrays;

public class BigBox {
  private Box box;

  public BigBox(){

  }

  public BigBox(Box box){
    this.box = box;
  }

  // 
  public long totalLongValue(){
    return this.box.totalLongValue();
    // OOP
  }

  public static void main(String[] args) {
    BigBox bb = new BigBox();
    // heap memory 
    // BigBox object ref (stack memory)
    // -> BigBox object (box obj ref)
    // -> Box object (long[] object)
    // -> Long[] object
    // ->

    Box backup = new Box(new long[] {1, 2});
    BigBox bb2 = new BigBox(backup);
    System.out.println(Arrays.toString(backup.getArr()));

    // for bb3, you lost the Box object
    // and if you do not provide any access method to box object
    // then you are no longer reaching it
    BigBox bb3 = new BigBox(new Box(new long[] {1, 2}));






  }
}
