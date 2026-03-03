public String toggle_case(String str){
    StringBuilder result = new StringBuilder();
    for(char ch:str.toCharArray()){
        if (Character.isLowerCase(ch)){
            ch = Character.toUpperCase(ch);
        }
        else if(Character.isUpperCase(ch)){
            ch = Character.toLowerCase(ch);
        }
        result.append(ch);
    }
    return result.toString();
}
