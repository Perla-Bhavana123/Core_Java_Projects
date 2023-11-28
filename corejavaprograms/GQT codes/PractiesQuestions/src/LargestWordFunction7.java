import java.util.Scanner;

public class LargestWordFunction7 {
	public class LongestWordFinder {
	    public static String findLongestWord(String inputString) {
	       
	        String[] words = inputString.split("\\s+");
            String longestWord = "";
	        int longestLength = 0;

	        for (String word : words) {
	          
	            word = word.replaceAll("[^a-zA-Z]", "");

	            if (word.length() > longestLength) {
	                longestWord = word;
	                longestLength = word.length();
	            }
	        }
            return longestWord;
	    }

	    public static void main(String[] args) {
	        String inputString = "This is a test sentence to find the longest word.";
	        String result = findLongestWord(inputString);
	        System.out.println("Longest word: " + result);
	    }
	}


}
