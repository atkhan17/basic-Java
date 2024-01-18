public static class funcs {

	/**
	 * This method accepts a positive integer n and that returns n characters: The middle character will always be an asterisk ("*"). 
	 * for even number of characters, there will be two asterisks in the middle ("**"). 
	 * Before the asterisk(s) ("<") will be inserted. 
	 * After the asterisk(s) (">") will be inserted.
	 * 
	 * @param n is the total number of strings returned by the method
	 * @return returns a string made of 1 or 2 stars between a number of "<" and ">" characters. The string length is equal to n
	 * @pre the integer n should be positive
	 */
	public static String writeChars(int n) {
		
		if (n < 1) {
			return "";
		}
		
		if (n == 1) {
			return "*";
		} else if (n == 2) {
			return "**";
		}
		
		return "<" + writeChars(n-2) + ">";
	}

	/**
	 * This method returns a substring of the given input string that is enclosed in two 
	 * given characters. 
	 * @param str is a string that contains at least two characters including <code> open </code> and <code> close </code> 
	 * @param open is a character at the beginning of the string that will be returned. 
	 * @param close is a character at the end of the string that will be returned.
	 * @return returns a string enclosed in two given characters of <code> open </code> and <code> close </code>.
	 * @pre The given str contains only one <code> open </code> and one <code> close </code> character.
	 */
	public static String getSubstring(String str, char open, char close) {
		int fin = str.length() - 1;
		
		if (str == "") {
			return "";
		}
		
		if (str.charAt(0) != (open)) {
			return getSubstring(str.substring(1), open, close);
		} else if (str.charAt(fin) != close) {
			return getSubstring(str.substring(0, fin), open, close);
		}
		
		return str.substring(1, fin);
		

	}
}

