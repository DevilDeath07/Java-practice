public void remove_all_occur(String str, String key) {
  int count = str.indexOf(key);
  
      while(count != -1) {
        str = str.substring(0, count)+str.substring(count+key.length()+1, str.length());
      System.out.println(str);
        count = str.indexOf(key, count+1);
      }
}
