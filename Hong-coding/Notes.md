# what is the different between .length and .length()?
So, in summary:

Use .length for arrays to get the length of the array.
Use .length() for strings to get the length of the string.
Remember, consistency is key when it comes to using these properties and methods in Java!

# what is this meaning
arr[i] = this.characters[i] == oldChar ? newChar : this.characters[i];

This line of code is using a ternary operator in Java to conditionally assign a new value to the i-th element of an array based on a comparison. Let me break it down for you:

arr[i]: This refers to the i-th element of the arr array that we are updating.
this.characters[i] == oldChar ? newChar : this.characters[i]: This is a ternary operator, which is a shorthand way of writing a simple if-else statement. It works as follows:
If this.characters[i] is equal to oldChar, then arr[i] is assigned the value of newChar.
If this.characters[i] is not equal to oldChar, then arr[i] is assigned the value of this.characters[i].
In essence, this line of code is replacing occurrences of oldChar with newChar in the arr array based on the comparison. It's a concise way to conditionally update array elements without needing a full if-else statement.

If you have any more questions or need further clarification, feel free to ask!

# // !!! make sure you understand the difference between them
  // 1. static final
  // 2. static
  // 3. final (belongs to object)
  // 4. instance variable (non-static, non final)

  Certainly! Let me explain the differences between the following in Java:

static final:
A static final variable in Java is a constant that belongs to the class itself and not to any particular instance of the class.
It is a class-level constant that can be accessed using the class name.
Once assigned a value, a static final variable cannot be changed throughout the program.
Example:
java

複製
public class Example {
    public static final int MAX_VALUE = 100;
}
static:
A static variable in Java belongs to the class and is shared among all instances of the class.
It is initialized when the class is loaded and exists for the entire lifetime of the program.
static variables are accessed using the class name and can be modified at any time.
Example:
java

複製
public class Example {
    public static int count = 0;
}
final (belongs to object):
A final variable in Java, when used without the static keyword, belongs to a specific instance of the class.
Once initialized, a final instance variable cannot be reassigned to a different value.
Each instance of the class can have a different value for a final instance variable.
Example:
java

複製
public class Example {
    public final int id;
    public Example(int id) {
        this.id = id;
    }
}
Instance variable (non-static, non-final):
An instance variable in Java belongs to a specific instance of a class.
It is not shared among different instances and can have different values for each object.
Instance variables can be modified throughout the object's lifetime.
Example:
java

複製
public class Example {
    public int number;
}
Understanding these distinctions is crucial for designing object-oriented programs in Java and managing the scope, mutability, and access levels of variables within classes. If you have any more questions or need further clarification, feel free to ask!

# what is the different between Pass by value and Pass by reference

In Java, it's important to understand the difference between pass by value and pass by reference when passing arguments to methods. Let me explain the concepts to you:

Pass by Value:
In Java, primitive data types (such as int, char, float, double, boolean, etc.) are passed by value.
When a method is called with a primitive data type as an argument, a copy of the actual value stored in the variable is passed to the method.
Any changes made to the parameter inside the method do not affect the original value in the calling code.
Changes made to the parameter inside the method are local to that method and do not impact the calling code.
Example:

java

複製
public void modifyValue(int value) {
    value = 10; // Changes the value locally
}

int num = 5;
modifyValue(num);
System.out.println(num); // Output: 5 (No change to the original value)
Pass by Reference:
In Java, non-primitive data types (objects, arrays, etc.) are passed by reference to the object.
When a method is called with a non-primitive data type as an argument, the reference (memory address) to the actual object is passed, not a copy of the object itself.
Any changes made to the object's state inside the method affect the actual object in the calling code.
Changes made to the object inside the method are reflected in the calling code since both the method and the calling code are operating on the same object.
Example:

java

複製
public void modifyArray(int[] arr) {
    arr[0] = 100; // Changes the original array
}

int[] array = {1, 2, 3};
modifyArray(array);
System.out.println(array[0]); // Output: 100 (Changes are reflected in the original array)
Understanding pass by value and pass by reference is crucial when working with methods and data manipulation in Java. It helps in handling data effectively and prevents unexpected behavior in your programs. If you have any more questions or need further clarification, feel free to ask!

#在Java中，這些關鍵字和修飾符代表著不同的功能和特性：

static final：這表示定義的變數是靜態的（屬於類別），並且它的值是不可變的（常數）。這種變數在程式執行期間不會改變，通常用於定義常數值，例如數學常數或者程式中不應該被修改的常數。

static：這表示定義的方法或變數是靜態的（屬於類別），而不是屬於類別的實例。靜態方法可以直接使用，不需要實例化對象。靜態變數在所有實例之間共享，可以通過類別名稱直接訪問。

final（屬於物件）：這表示定義的變數是一個常數，其值在對象初始化後無法更改。這意味著一旦賦值後，該變數的值將保持不變。這通常用於確保類中的特定變數不被修改。

實例變數（非靜態，非 final）：這表示定義的變數是屬於類的實例的一部分，每個類的實例都有自己的一組實例變數。這些變數的值可以因實例的不同而不同，並且可以在對象的整個生命週期中更改。
這些不同的關鍵字和修飾符在Java中用於不同的情況和目的，了解它們之間的區別有助於編寫更具結構性和清晰性的程式碼。如果您有任何其他問題或需要進一步的解釋，請隨時提出！


1.static final ->pi 3.14159...
final -> use it yourself only ,

 public -> can share ,
  private -> can not share 

2.void , no return keywords
System.out.println() 

3.static 
int a = 10;
all file -> class 
every class use this static variable 

- ArrayList
- Week 2 - Week 5

  @Override
  public String toString(){
    return "Staff(name=" + this.name + ")";
  }

  @Override 
  public boolean equals(Object obj){ // same name -> true, otherwise false
    if (this == obj)
      return true;
    if (!(obj instanceof Staff2)) // before downcast, we usually conside to use "instanceof"
      return false;
    // because we do not have staff object, so we cannot getName()
    // Parent -> Child (downcast);
    Staff2 staff = (Staff2) obj;
    return Objects.equals(this.name, staff.getName()) && Objects.equals(this.joinDate, staff.getJoinDate());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name, this.joinDate);
  }