import java.util.HashMap;
import java.util.Map;

public class HigherFrequencyChar {
	public static void main(String[] args) {
        String str = "I love Codeforwin.";

        // Count frequency of each character
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Find character with minimum occurrence
        char maxChar = '\0';
        int maxCount = Integer.MIN_VALUE;

        for (char ch : str.toCharArray()) { 
        	int count = freq.get(ch); 
        	if (count > maxCount) { 
        		maxCount = count; 
        		maxChar = ch; 
        		} 
        	}

        System.out.println("Minimum occurring character is '" + maxChar + "' = " + maxCount);
    }
}
