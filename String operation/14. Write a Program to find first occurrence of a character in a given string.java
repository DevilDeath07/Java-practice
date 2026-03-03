	public int first_occurance(String str,char key) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==key) {
				return i;
			}
		}
		return 0;
	}
