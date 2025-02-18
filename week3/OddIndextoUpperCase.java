package week3;

import java.util.Arrays;

public class OddIndextoUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="changeme";
		char[] charArray = input.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(i%2!=0) {
				charArray[i]= Character.toUpperCase(charArray[i]);
			}
		}
		String output= new String(charArray);
		System.out.println(output);
	}

}
