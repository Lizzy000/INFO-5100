public class Solution {
  public List<Integer> solution(String s) {
    List<Integer> list = new ArrayList<Integer>();
    int in = 0;
    int de = s.length();
    for (int i = 0; i < s.length() ; i++) {
	    if (s.charAt(i) == "I") {
		    list.add(in);
		    in++;
	    } 
	    if (s.charAt(i)== "D") {
		    list.add(de);
		    de--;
	    }
    }
    if (s.charAt(s.length()) == "I") {
	    list.add(in);
    }

    if (s.charAt(s.lenght()) == "D") {
	    list.add(de);
    }
    return list;
  }
}
