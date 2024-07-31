package VerveQuestions;

public class RemoveSpaceString {     // Remove space in a given string
	public static void main(String[] args) {
		String str="Verve Sqarae Technoly";
		String temp="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ') {
				temp=temp+str;
			}
		}
		str=temp;
		System.out.println(str);
		
		
		
		
		
						
	}

}
