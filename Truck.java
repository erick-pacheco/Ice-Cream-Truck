import java.io.*;

public class Truck extends Console {
  public void startShift() {
    try {
      File file = new File("assets/text/truck.txt"); // creates a new file instance
      FileReader fr = new FileReader(file); // reads the file
      BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream
      StringBuffer sb = new StringBuffer(); // constructs a string buffer with no characters
      String line;

      while ((line = br.readLine()) != null) {
        sb.append(line); // appends line to string buffer
        sb.append("\n"); // line feed

      }

      fr.close(); // closes the stream and release the resources
      log(sb.toString()); // returns a string that textually represents the object
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}