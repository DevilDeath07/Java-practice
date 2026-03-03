	public int count_words(String str) {
		int count = 0;
		for(char ch: str.toCharArray()) {
			if (ch == ' ') {
				count++;
			}
		}
		System.out.println("total no of words present in string is "+count);
		return 0;
	}
