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
    return 
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
  }





}
