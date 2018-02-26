package Chapter_3.Labs;

// ***************************************************************
//   StringManips.j ava
//
//   Test several methods for manipulating String objects
// ***************************************************************

import java.util.Scanner;

public class StringManips {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String phrase = "This is a String test.";
        int phraseLength;
        int middleIndex;

        String switchedPhrase;
        String middle3;

        System.out.println("Enter your city: ");
        String city = input.nextLine().toLowerCase();
        System.out.println("Enter your state: ");
        String state = input.nextLine().toUpperCase();


        // compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;

        // get the substring for each half of the phrase
        middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);

        // concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = phrase.replace(" ", "*");

        // print information about the phrase
        System.out.println();
        System.out.println ("Original phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength + " characters");
        System.out.println ("Index of the middle: " + middleIndex);

        System.out.println ("Character at the middle index: " + phrase.charAt(middleIndex));
        System.out.println ("Switched phrase: " + switchedPhrase);
        System.out.println("Middle 3 characters: " + middle3);
        System.out.println(state + city + state);
        System.out.println();
    }
}
