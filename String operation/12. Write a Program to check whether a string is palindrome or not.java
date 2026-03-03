public class Check_palindrome {
	public boolean palindrome(String str) {
		String result = "";
		for(int i=str.length()-1;i>=0;i--) {
			result = result+str.charAt(i);
		}		
		return str.equals(result);
	}

	public static void main(String[] args) {
		String str = "madam";
		Check_palindrome cp = new Check_palindrome();
		if(cp.palindrome(str)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}

