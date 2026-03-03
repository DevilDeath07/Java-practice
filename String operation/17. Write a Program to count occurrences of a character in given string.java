	public int occurance_count(String str, char key) {
		int count = 0;
		for(int i= 0;i<str.length();i++) {
			if(str.charAt(i) == key) {
				count++;
			}
		}
		return count;
	}
