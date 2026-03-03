public void trim_trailing_leading_whitespace(String str) {
  String result = str.stripTrailing();
  result = str.trim();
  System.out.println('"'+result+'"');
}
