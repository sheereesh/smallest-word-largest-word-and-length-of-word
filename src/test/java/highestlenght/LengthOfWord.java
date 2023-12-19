package highestlenght;

public class LengthOfWord {

	public static void main(String[] args) {
		 String str="krishna mohan vallabhaipatel  sheereeshnvergveup eee rajsh raghu raghuvaran kumar rrr re q af";

		//in order to find length in digits we have to change int longword="";
				String words[]=str.split(" "); 
				int wordlength=0;
				for(String word:words) {
					if(word.length()>wordlength) {
						wordlength=word.length();
					}
				}
				System.out.println(wordlength);

	}

}
