	public void remove_dup_char(String str) {
		Set<Character> seen = new LinkedHashSet<>();
		for(char c: str.toCharArray()) {
			seen.add(c);
		}
		
		StringBuilder result = new StringBuilder();
		for(char c: seen) {
			result.append(c);
		}
		System.out.println(result.toString());
		
		
	}
