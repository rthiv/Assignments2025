package week3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="stops";
		String s2="potss";
		boolean isAnagram=true;
		if(s1.length()!=s2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		else {
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			for(int i=0;i<charArray2.length;i++) {
				if(charArray1[i]==charArray2[i]) {
					isAnagram=true;
				}
				else {
					isAnagram=false;
					break;
				}
				}
			if(isAnagram==true) {
				System.out.println("It is an Anagram");
			}
			else {
				System.out.println("It is not an Anagram");
			}
			}
			
		}
	}

