import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class TextEditor {
  // Word: append(), undo(), redo()
  private String text;
  private Deque<String> undoStack;
  private Deque<String> redoStack;

  public TextEditor (){
    this.text = "";
    this.undoStack = new LinkedList<>();
    this.redoStack = new LinkedList<>();
  }

  public String getText(){
    return this.text;
  }

  public void append(String newText){
    this.undoStack.push(this.text);
    this.redoStack.clear();
    this.text += newText;
  }

  public void undo(){
    if (!this.undoStack.isEmpty()){
    this.redoStack.push(this.text);
    this.text = this.undoStack.pop();
    } else{
      System.out.println("No action to undo.");
    }
  }

  public void redo(){
    if (!redoStack.isEmpty()) {
      this.undoStack.push(this.text);
      this.text = this.redoStack.pop();
    } else{
      System.out.println("No action to redo.");
    }
  }

  @Override
  public String toString(){
    return this.text;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof TextEditor))
      return false;
    TextEditor te = (TextEditor) obj;
      return Objects.equals(this.text, te.getText());
    }

  @Override
  public int hashCode(){
    return Objects.hash(this.text);
  }


  public static void main(String[] args) {
    TextEditor editor = new TextEditor();
    editor.append("Hello"); // undoStack: "", this.text = Hello
    editor.append(" World"); // undoStack: "Hello", this.text = Hello World
    editor.append("!"); // undoStack: "Hello World", this.text = Hello World!
    System.out.println(editor); // Hello World!
    editor.undo();
    System.out.println(editor); // Hello World
    editor.redo();
    System.out.println(editor); // Hello World!
    editor.undo();
    System.out.println(editor); // Hello World
    editor.undo();
    System.out.println(editor); // Hello
    editor.undo();
    System.out.println(editor); // ""
    editor.redo();
    System.out.println(editor); // Hello
    editor.redo();
    System.out.println(editor); // Hello World
    System.out.println("---------------");

    TextEditor editor2 = new TextEditor();
    editor2.undo();
    System.out.println(editor2); // java.util.NoSuchElementException
    editor2.redo();
    System.out.println(editor2); // java.util.NoSuchElementException
    editor2.append("test");
    System.out.println(editor2); // test
    editor2.redo();
    System.out.println(editor2); // test
    editor2.undo();
    System.out.println(editor2); // ""

  }
}
