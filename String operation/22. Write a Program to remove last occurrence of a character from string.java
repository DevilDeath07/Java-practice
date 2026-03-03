	public String remove_last(String str, char ch) {
		int index = 0;
		for(int i= 0;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				index = i;
			}
		}
		String result = str.substring(0,index)+str.substring(index+1, str.length());
		System.out.println(result);
		return result;
	}
