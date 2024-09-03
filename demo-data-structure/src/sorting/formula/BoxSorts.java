package sorting.formula;

public class BoxSorts{

  private BoxSorts;
  // return interface type
  public static BoxSort asc(){
    return new BoxSortByIntAsc();
  }

  public static BoxSort desc(){
    return new BoxSortByIntDesc();
  }
}
