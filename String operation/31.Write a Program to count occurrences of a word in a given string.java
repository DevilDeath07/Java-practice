public void count_occur(String str, String key) {
  int count = str.indexOf(key);
  int result = 0;
      while(count != -1) {
        result++;
        count = str.indexOf(key, count+1);
      }
      System.out.println(key+" occured in "+ result);
}
