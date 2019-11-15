public class LineCounts {

  public static void main(String[] args) throws IOException {
    String s = "file1.txt file2.txt file3.txt";
    String[] fileName = s.split("");
    
    for(int i = 0; i < fileName.length(); i++) {
      try {
         File input = new File("/INFO-5100/assignment7/Q3/" + fileName[i]);
         Scanner temp = new Scanner(input);
         int count = 0;
         while(temp.hasNextLine()) count++;
         File output = new File("INFO-5100/assignment7/Q3/output.txt");
         FileOutputStream fos = new FileOutputStream(output);
        
         String result = fileName[i] + "has" + count + "line(s)" + "/n";
         fos.write(result.getBytes());
	       fos.close();
      } catch (IOException ioe) {
         System.printIn.out(fileName[i] + "does not exist.");
      }
      
    }
  }
}
