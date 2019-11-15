import java.io.*;

public class DecodeTest {

  public static void main(String[] args) throws Exception {
    File file = new File("/INFO-5100/assignment7/Q2/input.txt");
    FileInputStream fis = new FileInputStream(file);
    String s = readFromStream(fis);
		
    String result = decodeString(s);
    writeToFile(result);

  }

  private static String readFromStream(FileInputStream fis) throws IOException {
    String result = "";
    while (true) {
	int x = fis.read();
	if (x == -1) break;
	char c = (char) x;
	result += c;
    }
    fis.close();
    return result;
  }
  
  private static void writeToFile(String s) {
    File file = new File("/INFO-5100/assignment7/Q2/output.txt");
    FileOutputStream fos = new FileOutputStream(file);
    fos.write(s.getBytes());
    fos.close();
  }
   
  
  private static String decodeString(String s) {
    if (s.length() == 0) return "";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i ++) {
        char c = s.charAt(i);
        if (Character.isDigit(c)) {
            int digit_begin = i;
            while (s.charAt(i) != '[') i++;
            int num = Integer.valueOf(s.substring(digit_begin, i));
            int count = 1;
            int str_begin = i+1;
            i ++;
            while (count != 0) {
                if (s.charAt(i) == '[') count ++;
                else if (s.charAt(i) == ']') count --;
                i ++;
            }
            i--;
            String str = decodeString(s.substring(str_begin, i));
            for (int j = 0; j < num; j ++) {
                sb.append(str);
            }
        } else {
            sb.append(c);
        }
    }
    return sb.toString();
  }
}
