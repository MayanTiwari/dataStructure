package basic.string.problems;

import java.util.HashMap;

public final class StringProblems {

	private static final char DEFAULTCHAR = ' ';

	public static char getFirstNonRepeatedChar(String inputString) {
		char result = ' ';

		if (inputString.isEmpty())
			return DEFAULTCHAR;
		HashMap<Character, Character> charMap = new HashMap<Character, Character>();
		for (int i = 0; i < inputString.length(); i++) {
			if (charMap.containsKey(inputString.charAt(i)))
				return inputString.charAt(i);
			else
				charMap.put(inputString.charAt(i), inputString.charAt(i));
		}
		// for(char c : inputArray){
		// if(charMap.get(c) !=null ) return c;
		// else
		// charMap.put(c, c);
		// }

		return result;
	}
}
