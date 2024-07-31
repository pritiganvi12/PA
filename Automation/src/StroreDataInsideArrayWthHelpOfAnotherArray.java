
public class StroreDataInsideArrayWthHelpOfAnotherArray {
	public static void main(String[] args) {
		String [] [] array= {{"FirstName", "lastname", "email", "password"},
				{"priti", " ganvir", "priti@gmail.com", "Pri@12"},
				{"pratiksha", "mulande", "pratiksha@gmail.com", "Pra@56"},
				{"rutuja", " hass", "rutu@gmail.com", "Ruru@56"}};
		
		String [ ][ ]  result=new String[array.length][ ];
		for(int i=0;i<array.length;i++) {
			result[i]=new String[array[i].length];
			for(int j=0;j<array[i].length; j++) {
				result [i] [j]=array [i] [j];
			}
		}
		for(int i=0;i<result.length;i++) {
			for(int j=0; j<result[i].length;j++) {
				System.out.println(result[i] [j] + "\t");
			}
			System.out.println();
		}
	}

}
