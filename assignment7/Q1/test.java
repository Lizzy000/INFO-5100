import java.io.*

public class test {
  public static void main(String args[]) {
    FileInputStream fis = new FileInputStream(...);
    FileOutputStream fos = new FileOutputStream(...);
    
    StringBuffer sb = new StringBuffer();
    int tempBit;
    while((tempBit = fis.read()) != -1) {
      sb.append(tempBit);
    }
    
  }
}
