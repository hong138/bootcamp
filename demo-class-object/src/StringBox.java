
import java.util.Arrays;



public class StringBox {
  private char[] characters; // obj ref

  // new String
  public StringBox(String s){ // abc
    // s -> char[]
    this.characters = new char[s.length()]; // !
      for (int i = 0; i < s.length(); i++) {
        this.characters[i] = s.charAt(i);
      }
  }

  public char[] getCharacters(){
    return this.characters;
  }

  // revise the data of the object
  // different between setCharAt() and replace()
  public void setCharAt(char c, int index){
    this.characters[index] = c;
  }

  // sb.charAt
  public char charAt(int index){
    return this.characters[index];
  }

  public int length(){
    return this.characters.length;
  }

  // firstIndexOf
  public int indexOf(char c){
    for (int i = 0; i < this.characters.length; i++){
      if (this.characters[i] == c){
        return i;
      }
    }
    return -1;
  }

  // replace('c', 'x')
  public String replace(char oldChar, char newChar) {
    char[] arr = new char[this.characters.length];
    for (int i = 0; i < this.characters.length; i++) {
        arr[i] = this.characters[i] == oldChar ? newChar : this.characters[i];
    }
    return String.valueOf(arr);
}

  public String subString(int beginIndex, int endIndex) {
    char[] arr = new char[this.characters.length];
    for (int i = beginIndex; i < endIndex; i++) {
        arr[i] = this.characters[i];
    }
    return String.valueOf(arr); // char[] -> String
  }

  public String toString(){
    return String.valueOf(this.characters);
  }


  public static void main(String[] args) {
    String s = new String("abc");
    StringBox sb = new StringBox("abc");

    s.charAt(1);
    sb.charAt(1);

  System.out.println(sb.replace('c', 'x'));
  System.out.println(sb.toString());

  System.out.println(s.substring(0,2));

  // Pass by 
  StringBox sb2 = sb; // StringBox Object address
  System.out.println(sb);
  System.out.println(sb2);
  sb.setCharAt('f', 2);
  System.out.println(sb);
  System.out.println(sb2);


  char[] arr = sb.getCharacters();
  arr[0] = 'm';

  System.out.println(sb);
  System.out.println(sb2);

  // remove the linkages between sb/sb2 and StringBox Object
  sb = null;
  sb2 = null;
  // but the char array 
  System.out.println(Arrays.toString(arr));

  
  }




}
