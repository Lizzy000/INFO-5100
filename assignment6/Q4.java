
public boolean uniqueOccurrences(int[] arr) {
  Map<Integer, Integer> occ = new HashMap<>();
  for(int i = 0; i < arr.length; i++) {
    int count = 0;
    if(occ.get(arr[i]) != null) {
      count = occ.get(arr[i]);
    }
    occ.put(arr[i], count++);
  }
  for(Integer key: occ.keyset()) {
    int value = occ.get(key);
    if(occ.containsValue(value)) return false;
  }
  return true;
}
