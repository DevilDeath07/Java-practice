public int count_total_vowel_consonat(String str) {
  int vowel = 0;
  int consonant = 0;
  for(char s: str.toCharArray()) {
    if (isVowelBySwitch(s)) {
      vowel++;
    }
    else {
      consonant++;
    }
  }
  System.out.println("vowel="+vowel);
  System.out.println("consonant="+consonant);
  return 0;
}
