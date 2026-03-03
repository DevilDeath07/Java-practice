	public void remove_first_occur(String str,char ch) {
		for(int i =0;i<=str.length();i++) {
			if (str.charAt(i) == ch) {
				System.out.println(str.substring(i+1, str.length()));
				break;
			}
		}
	}
