package PractiesSet1;
import java.util.Scanner;
public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String input = sc.nextLine(); // Change this to your input string
        System.out.println("Unique Permutations of \"" + input + "\":");
        printUniquePermutations(input);
    }

    public static void printUniquePermutations(String input) {
        char[] charArray = input.toCharArray();
        generateUniquePermutations(charArray, 0);
    }

    private static void generateUniquePermutations(char[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (shouldSwap(arr, index, i)) {
                // Swap characters at index and i
                char temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                // Recursively generate permutations for the remaining characters
                generateUniquePermutations(arr, index + 1);

                // Undo the swap to backtrack
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    private static boolean shouldSwap(char[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] == arr[end]) {
                return false;
            }
        }
        return true;
    }

	}

