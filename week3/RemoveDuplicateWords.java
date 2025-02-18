package week3;

import java.util.Arrays;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="We learn Java basics as part of java sessions in java week1";
		int duplicateCount=0;
		String[] words= text.split(" ");
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					words[j]="";
					duplicateCount=duplicateCount+1;
				}
			}
		}
		if(duplicateCount>0) {
			String output= String.join(" ", words);
			System.out.println(output);
		}
	}

}
