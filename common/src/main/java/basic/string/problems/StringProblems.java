package basic.string.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class StringProblems {

	private static final char DEFAULTCHAR = ' ';

	// Assume ACSII values only
	public static char getFirstRepeatedChar(String inputString) {
		char result = DEFAULTCHAR;

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

	// Handeling Unicode pointers.
	public static String getFirstNonRepeatedChar(String inputString) {
		Map<Integer, Object> charHash = new HashMap<Integer, Object>();
		Object seenOnce = new Object();
		Object SeenMultiple = new Object();
		Object seen;
		int i;
		for (i = 0; i < inputString.length();) {
			final int cp = inputString.codePointAt(i);
			i += Character.charCount(cp);
			seen = charHash.get(cp);
			if (seen == null) {
				charHash.put(cp, seenOnce);
			} else if (seen == seenOnce) {
				charHash.put(cp, SeenMultiple);
			}
		}
		for (i = 0; i < inputString.length();) {
			final int cp = inputString.codePointAt(i);
			i += Character.charCount(cp);
			if (charHash.get(cp) == seenOnce) {
				return new String(Character.toChars(cp));
			}

		}

		return null;

	}

	public static String removedSpecifiedChars(String inputString, String seq) {
		// assert inputString.isEmpty() || seq.isEmpty();

		Map<Character, Character> charHash = new HashMap<Character, Character>();
		char[] stringArray = inputString.toCharArray();
		StringBuilder result = new StringBuilder(stringArray.length);
		for (int i = 0; i < seq.length(); i++) {
			if (!charHash.containsKey(seq.charAt(i)))
				charHash.put(seq.charAt(i), seq.charAt(i));
		}
		for (char c : stringArray) {
			if (!charHash.containsKey(c))
				result.append(c);
		}
		return result.toString();
	}

	// Nice way to play with arrays .
	public static String removedSpecificCharsUsingArray(String inputString, String seq) {
		char[] s = inputString.toCharArray();
		char[] r = seq.toCharArray();
		int src, dst = 0;
		// Flags automatically initialize to false.Assuming ASCII size 128
		boolean[] flags = new boolean[128];

		// Set flags for characters to be removed .
		for (src = 0; src < r.length; ++src) {
			flags[r[src]] = true;
		}

		for (src = 0; src < s.length; ++src) {
			if (!flags[s[src]]) {
				s[dst++] = s[src];
				// System.out.println("Source: " + src);
				// System.out.println("Destination: " + dst);
			}
		}
		return new String(s, 0, dst);
	}
	//Not working
	public static String reverseWordsInplace(String inputString) {
		char[] str = inputString.toCharArray();
		reverseString(str, 0, str.length - 1);
		int token, start, end;
		token = 0;
		while (token < str.length) {
			start = token;
			while (str[token] != ' ')
				token++;
			end = token - 1;
			reverseString(str, start, end);
			token++;
		}
		return str.toString();

	}

	private static void reverseString(char[] str, int start, int end) {
		char temp = ' ';
		while (start < end) {
			temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}

	public static String reverseWords(String inputString) {
		char[] buffer = new char[128];
		int length = inputString.length();
		int tokenReadPos, wordReadPos, wordEnd, writePos = 0;
		tokenReadPos = length - 1;
		while (tokenReadPos > 0) {
			if (inputString.charAt(tokenReadPos) == ' ') {
				buffer[writePos++] = inputString.charAt(tokenReadPos--);
			} else {
				wordEnd = tokenReadPos;
				while (inputString.charAt(tokenReadPos) == ' ')
					tokenReadPos--;
				wordReadPos = tokenReadPos + 1;

				while (wordReadPos <= wordEnd) {
					buffer[writePos++] = inputString.charAt(wordReadPos++);
				}
			}

		}

		return buffer.toString();
	}

	// 325
	public static int stringToInt(String input) {
		if (input.isEmpty())
			return 0;
		int num = 0;
		int multiplier = 1;
		boolean isNegative = false;
		if (input.charAt(0) == '-') {
			isNegative = true;

		}
		for (int i = input.length() - 1; i >= 0; i--) {
			if (input.charAt(i) != '-') {
				num += (input.charAt(i) - '0') * multiplier;
				multiplier *= 10;
			}
		}
		if (isNegative)
			num = num * (-1);
		return num;
	}

	public static String IntToString(int input) {
		int i = 0;
		boolean isNeg = false;
		char[] temp = new char[10];
		if (input < 0) {
			input = -input;
			isNeg = true;
		}
		do {
			temp[i++] = (char) ((input % 10) + '0');
			input /= 10;
		} while (input != 0);
		StringBuilder b = new StringBuilder();
		if (isNeg)
			b.append('-');
		while (i > 0) {
			b.append(temp[--i]);
		}
		return b.toString();
	}
}
