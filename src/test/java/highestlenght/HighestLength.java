package highestlenght;

public class HighestLength {

	public static void main(String[] args) {
	 
			 String str="krishna mohan  vallabhaipatel eee rajsh raghu raghuvaran  kumar rrr re q af";
	String longword="";
	//in order to find length in digits we have to change int longword="";
			String words[]=str.split(" ");
			for(String word:words) {
				if(word.length()>longword.length()) {
					longword=word;
				}
			}
			System.out.println(longword);
		}

	}


