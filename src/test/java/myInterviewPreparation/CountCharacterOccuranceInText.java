package myInterviewPreparation;

public class CountCharacterOccuranceInText {

	public static void main(String[] args) {
		//characterOccurance("nagaraja", 'a');
		characterOccuranceWithStringLength("characterOccuranceWithStringLength", 'n' );

	}
	
	public static void characterOccurance(String str, char ch ) {
		int occurance = 0;
		for(char chr : str.toCharArray()) {
			if(chr==ch) {
				occurance++;
			}
		}
		System.out.println("This character '"+ ch + "' occured " + occurance + " times");
	}
	
	public static void characterOccuranceWithStringLength(String str, char ch ) {
		int occurance = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)== ch) {
				occurance++;
			}
		}
		System.out.println("This character '"+ ch + "' occured " + occurance + " times");
	}
	
	

}
