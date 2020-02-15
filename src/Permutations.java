/*
Permutations example
https://learn.zybooks.com/zybook/UWFCOP5007Spring2020/chapter/14/section/9
*/
import java.util.Scanner;

public class Permutations {
    // FIXME: Use a static variable to count permutations. Why must it be static?
    private static int permuteCount;

    public static void permuteString(String head, String tail) {
        char current;
        String newPermute;
        int len;
        int i;

        current = '?';
        len = tail.length();

        if (len <= 1) {
            // FIXME: Output the permutation count on each line too
            permuteCount++;
//            System.out.println(head + tail + " Count: " + permuteCount);
            System.out.println(permuteCount + ") " + head + tail);
        }
        else {
            // FIXME: Change the loop to output permutations in reverse order
            //for (i = 0; i < len; ++i) {
            for (i = len-1; i >= 0; --i) {
                current = tail.charAt(i);           // Get next leading character
//                System.out.println("Substring 1: " + tail.substring(0, i));
//                System.out.println("Substring 2: " + tail.substring(i+1));
                newPermute = tail.substring(0, i) + tail.substring(i + 1);
                // Get the rest of the tail
                permuteString(head + current, newPermute);
            }
        }
    }

    public static void main(String [] args) {
        final String PROMPT_STRING = "Enter a string to permute (<Enter> to exit): ";
        Scanner scnr = new Scanner(System.in);
        String input;

        // Get input and permute the string
        System.out.println(PROMPT_STRING);
        input = scnr.nextLine();

        while (input.length() > 0) {
            permuteString("", input);
            System.out.println(PROMPT_STRING);
            input = scnr.nextLine();
        }
        System.out.println("Done.");
    }
} 