import java.io.*

  
public static void main(String[] args) throws Exception {
		File input = new File("INFO-5100/assignment7/Q1/Input.txt");
		FileInputStream fis = new FileInputStream(input);
		String result = readFromStream(fis);
  
    String s[] = result.split(" "); 
    String ans = ""; 
    for (int i = s.length - 1; i >= 0; i--) { 
      ans += s[i] + " "; 
    } 
    writeToFile(ans);
}

private String readFromStream(FileInputStream fis) throws IOException {
    String result = "";
		while (true) {
			int x = fis.read();
			if (x == -1)
				break;
			char c = (char) x;
			result += c;
		}
		fis.close();
    return result;
}


private void writeToFile(String ans) throws IOException {
    File file = new File("INFO-5100/assignment7/Q1/Output.txt");
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(ans.getBytes());
		fos.close();
}
