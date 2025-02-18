package week3;

import java.util.Collections;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] split = test.split(" ");
		for(int i=0;i<split.length;i++) {
			if(i%2!=0) {
				StringBuffer reverse = new StringBuffer(split[i]);
				reverse.reverse();
				split[i]=reverse.toString();
				}
			}
		String output= String.join(" ", split);
		System.out.println(output);
		}

}
