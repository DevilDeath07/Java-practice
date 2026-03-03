    public int occurance_count(String str, char key) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == key) {
                count++;
            }
        }
        return count;
    }
    
    public void count_frequency(String str) {
        HashSet<Character> visited = new HashSet<>();
        frequency_char fc1 = new frequency_char();
        
        for(char ch : str.toCharArray()) {
            if(!visited.contains(ch)) {  // only count if not already visited
                int temp = fc1.occurance_count(str, ch);
                visited.add(ch);
                System.out.println(ch + " = " + temp);
            }
        }
    }
