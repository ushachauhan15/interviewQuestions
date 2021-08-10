package Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class NumberConversion {
public static void main(String[] args) {
	String str1="abcdb";
	String str2="bcabd";
	char[] charstr1=str1.toCharArray();
	char[] charstr2=str2.toCharArray();
	Arrays.sort(charstr1);
	Arrays.sort(charstr2);
		int count=0;
	if(charstr1.length==charstr2.length) {
	for(int i=0;i<charstr1.length;i++) {
		if(charstr1[i]==charstr2[i])
			count++;
	}
	}
	if(count==charstr1.length)
		System.out.println("Strings are are anagram");
	else
		System.out.println("Not anagram");
			/*
			 * Set<Character> set1=new TreeSet<>(); Set<Character> set2=new TreeSet<>(); int
			 * count=0;
			 * 
			 * for(int i=0;i<charstr2.length;i++) { set1.add(charstr2[i]);
			 * 
			 * }
			 * 
			 * for(int i=0;i<charstr1.length;i++) { set2.add(charstr1[i]);
			 * 
			 * } if(set1.equals(set2))
			 */
		
}
}
