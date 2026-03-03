public void reverse_order_word(String str) {
  String result = "";
  int prev = str.length();
  for(int i = str.length()-1;i>=0;i--) {
    if(str.charAt(i)==' ') {
      CharSequence sub = str.subSequence(i, prev);
      prev = i;
      result = result + sub.toString();
      
    }
  }
  System.out.println(result);
}
