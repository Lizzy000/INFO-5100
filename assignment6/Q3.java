class Solution {
  public boolean isAnagram(String s, String t) {
    
    if(s.length() != t.length()) return false;
    
    char[] S = s.toCharArray();
    char[] T = t.toCharArray();
    
    List<char> Ss = new ArrayList<>();
    List<char> Tt = new ArrayList<>();
    
    for(int i = 0; i < S.length; i++) {
      Ss.add(S[i]);
    }
    for(int i = 0; i < T.length; i++) {
      Tt.add(T[i]);
    }
    
    while(Ss.size() != 0) {
      for(int i = 0; i < Ss.size(); i++) {
        if(Ss.get(i) == Tt.get(0)) {
          Ss.remove(i);
          Tt.remove(0);
          break;
        }
      }
      return false;
    }
    
  }
}
