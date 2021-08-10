package Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

// Check if 2 strings are anagram or not
public class Anagram {
	public static void main(String[] args) {
		String str1 = "abcdb";
		String str2 = "bcabd";
		//Approch 1
		char[] charstr1 = str1.toCharArray();
		char[] charstr2 = str2.toCharArray();
		Arrays.sort(charstr1);
		Arrays.sort(charstr2);
		int count = 0;
		if (charstr1.length == charstr2.length) {
			for (int i = 0; i < charstr1.length; i++) {
				if (charstr1[i] == charstr2[i])
					count++;
			}
		}
		if (count == charstr1.length)
			System.out.println("Strings are  Anagram");
		else
			System.out.println("Not Anagram");

	}
}
