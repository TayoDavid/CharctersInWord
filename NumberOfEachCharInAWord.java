class NumberOfEachCharInAWord {
	/**
	 *	This program prompts the user to enter a word in
	 *  lowercase, computes and print the number of each 
	 *  characters in the word.
	 *   
	 *  author Omatayo
	 */

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Prompt the user to enter a word in lower case
		System.out.print("Enter a word (all letters in lowercase) : ");
		String word = input.next();

		char[] charInWord = word.toCharArray();

		int[] counts = countLetters(charInWord);

		System.out.println();
		System.out.println("The occurrences of each letter are: ");
		displayCounts(counts);
	}

	public static int[] countLetters(char[] chars) {
		// Declare and create an array of 26 int
		int[] counts = new int[26];

		// For each lette int array, count it.
		for (int i = 0; i < chars.length; i++) 

			counts[chars[i] - 'a']++;

		return counts;
	}

	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] == 0){ 
			}
			else
				System.out.println(counts[i] + " " + (char)(i + 'a'));
		}	
	}
}