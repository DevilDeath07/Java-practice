public void remove_multiple_whitespace(String str) {
  String result = str.trim();;
  result = str.replaceAll("\\s+", " ");
  System.out.println('"'+result+'"');
}
