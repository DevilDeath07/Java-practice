	public void search_occurance(String str,char key) {
		for(int i= 0;i<str.length();i++) {
			if(str.charAt(i) == key) {
				System.out.println(i);
			}
		}
		
	}
