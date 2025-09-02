
public class Main {

    public static void main(String[] args) {
        String message = "The weather is good today.";

// Returns the number of characters in the string (read-only)
        System.out.println(message.length()); //  no new string (permanent)

// Returns the character at index 4 (read-only)
        System.out.println(message.charAt(4)); //  no new string (permanent)

// Adds text to the end and returns a new string
        System.out.println(message.concat(" Nice!")); //  new string (temporary)

// Checks if the string starts with "B"
        System.out.println(message.startsWith("B")); //  boolean only

// Checks if the string ends with "."
        System.out.println(message.endsWith(".")); //  boolean only

        char[] characters = new char[5];
// Copies first 5 characters into a char array
        message.getChars(0, 5, characters, 0); //  modifies the array (not string itself)

// Finds the first index of "er"
        System.out.println(message.indexOf("er")); //  int result, no new string

// Finds the last index of "ay"
        System.out.println(message.lastIndexOf("ay")); //  int result, no new string

// Replaces all spaces with dashes, returns a new string
        String newMessage = message.replace(' ', '-'); //  new string (temporary)
        System.out.println(newMessage);

// Returns a substring from index 2 to 5
        System.out.println(message.substring(2, 5)); //  new string (temporary)

// Splits the string by spaces and prints each word
        for (String word : message.split(" ")) { //  creates new String[]
            System.out.println(word);
        }

// Converts to lowercase and returns a new string
        System.out.println(message.toLowerCase()); //  new string (temporary)

// Converts to uppercase and returns a new string
        System.out.println(message.toUpperCase()); //  new string (temporary)

        String word = " Yes";
// Removes leading and trailing spaces
        System.out.println(word.trim()); //  new string (temporary)





    }
}