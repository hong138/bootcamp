public class HongCodingTrial {
  public static void main(String[] args) {
    String services = "FS";
    String services2 = "DR";
    
    int FS_pipe_size = 200;
    int DR_pipe_size = 100;

    if ("FS".equals(services)){
      int opening_size = FS_pipe_size + 100;
      String message = "The " + services + " opening size is " + opening_size + "mm";
      System.out.println(message);
    } else if("DR".equals(services2)){
      int opening_size = DR_pipe_size + 150;
      String message = "The " + services + " opening size is " + opening_size + "mm";
      System.out.println(message);
    } else {
      System.out.println("The pipe services not FS and DR");
    }

    }

  }

