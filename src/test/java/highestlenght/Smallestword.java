package highestlenght;

public class Smallestword {

	public static void main(String[] args) {

		 String str="krishna mohan vallabhaipatel eee rajsh raghu raghuvaran kumar rrr re q af";

//in order to find length in digits we have to change int longword="";
		String words[]=str.split(" "); 
		String smallestword=words[0];
		for(String word:words) {
			if(word.length()<smallestword.length()) {
				smallestword=word;
			}
		}
		System.out.println(smallestword);
}
	
}