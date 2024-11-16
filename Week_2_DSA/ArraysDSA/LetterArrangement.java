/*
3. Arranging Letters with No Repeating Adjacent Letters
Problem: Given a string of letters, arrange them in such a way that no two adjacent letters are
the same. Count the number of possible valid arrangements.

Example:

Input: "AAB"
Output: 1 arrangements: ABA
*/

import java.util.*;

public class LetterArrangement {

    // Helper method to generate all permutations of the letters
    static void generatePermutations(char[] letters, int start, Set<String> result) {
        if (start == letters.length - 1) {
            result.add(new String(letters)); // Convert char array to string and add to result set
            return;
        }

        for (int i = start; i < letters.length; i++) {
            // Swap the current character with the start character
            swap(letters, start, i);
            // Recurse with the next character
            generatePermutations(letters, start + 1, result);
            // Backtrack: undo the swap
            swap(letters, start, i);
        }
    }

    // Helper method to swap two elements in the array
    static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Method to check if the arrangement has no repeating adjacent letters
    static boolean isValidArrangement(String arrangement) {
        for (int i = 0; i < arrangement.length() - 1; i++) {
            if (arrangement.charAt(i) == arrangement.charAt(i + 1)) {
                return false; // Invalid if adjacent characters are the same
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "AAB";
        char[] letters = input.toCharArray();

        // Set to store unique valid arrangements
        Set<String> validArrangements = new HashSet<>();

        // Generate all permutations of the letters
        Set<String> allArrangements = new HashSet<>();
        generatePermutations(letters, 0, allArrangements);

        // Filter valid arrangements
        for (String arrangement : allArrangements) {
            if (isValidArrangement(arrangement)) {
                validArrangements.add(arrangement);
            }
        }

        // Output the valid arrangements
        System.out.println("Valid arrangements: " + validArrangements.size());
        for (String arrangement : validArrangements) {
            System.out.println(arrangement);
        }
    }
}
