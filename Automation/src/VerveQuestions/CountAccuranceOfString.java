package VerveQuestions;

public class CountAccuranceOfString {   // to count the accurance of one string inside another
	public static void main(String[] args) {
		String str="Java is programing lang, java is string";
		String str2=" ";
		String[] a=str.split(" ");
		int count=0;
		for(int i=0; i<a.length;i++) {
			if(a[i].equalsIgnoreCase(str2)) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}
}
