
public void all_occur(String str, String key) {
  int count = str.indexOf(key);
  
      while(count != -1) {
        System.out.println(key+" Starts at "+count);
        count = str.indexOf(key, count+1);
      }
}
