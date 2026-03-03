public void Swap_last(String str, char ch, char swap) {
  int index = 0;
  for(int i= 0;i<str.length();i++) {
    if(str.charAt(i) == ch) {
      index = i;
    }
  }
  // Convert to char array for mutability
      char[] chars = str.toCharArray();

      
      chars[index] = swap;
      String result = new String(chars);
      System.out.println(result);
}
