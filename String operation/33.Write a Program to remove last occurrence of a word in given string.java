
public void remove_last_occur(String str, String key) {
  int count = str.lastIndexOf(key);
  String result = str.substring(0, count)+str.substring(count+key.length()+1, str.length());
  System.out.println(result);
}
