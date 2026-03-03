	public int last_occurance(String str,char key) {
		int index = 0;
		for(int i= 0;i<str.length();i++) {
			if(str.charAt(i) == key) {
				index = i;
			}
		}
		return index;
	}
