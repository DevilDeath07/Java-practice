public void count_char(String str){
    int alphabets = 0;
    int digits = 0;
    int special_characters = 0;
    for(char ch:str.toCharArray()){
        if (Character.isAlphabetic(ch)){
            alphabets++;
        }
        else if(Character.isDigit(ch)){
            digits++;
        }
        else{
            special_characters++;
        }
    }
    System.out.println("Alphabets = "+alphabets);
    System.out.println("Digits = "+digits);
    System.out.println("Special characters = "+special_characters);
}
