package VerveQuestions;

public class CountAccuranceCharacterString {   // to count accurance of character in a string
	public static void main(String[] args) {
		String str="Verve Sqare Technology";
		char ch = 'e';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(count);
	}

}
