	public String reverse_string(String str) {
		String result = "";
		for(int i=str.length()-1;i>=0;i--) {
			result = result+str.charAt(i);
		}
		System.out.println(result);
		return result;
	}
