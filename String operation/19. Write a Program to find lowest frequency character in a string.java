public class LowestFrequencyChar {
    public static void main(String[] args) {
        String str = "I love learning programming at Codeforwin.";

        // Count frequency of each character
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Find character with minimum occurrence
        char minChar = '\0';
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                minChar = entry.getKey();
            }
        }

        System.out.println("Minimum occurring character is '" + minChar + "' = " + minCount);
    }
}
