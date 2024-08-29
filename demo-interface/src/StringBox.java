
import java.util.Arrays;

public class StringBox implements CharSequence {
  private char[] characters;

  public StringBox(){
    this.characters = new char[0];
  }

  public StringBox(String s){
    this.characters = s.toCharArray();
  }

  @Override
  public int length(){
    return this.characters.length;
  }

  @Override
  public char charAt(int index){
    return this.characters[index];
  }

  @Override
  public CharSequence subSequence(int start, int end){
    char[] arr = new char[end - start];
    int idx = 0;
    for (int i = start; i < end; i++) {
      arr[idx++] = this.characters[i];
    }
    return new StringBox(String.valueOf(arr));
  }

  public StringBox append(String s){
    char[] arr = Arrays.copyOf(this.characters, this.characters.length + s.length());
    int idx = this.characters.length;
    for (int i = 0; i < s.length(); i++) {
        arr[idx++] = s.charAt(i);
    }
    return new StringBox(String.valueOf(arr));
  }

  @Override
  public String toString(){
    return String.valueOf(this.characters);
  }

}
