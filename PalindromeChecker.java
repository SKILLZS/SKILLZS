// Follow the instructions on the Stack Exercise document to complete
// this program so that it can check whether or not a given word/phrase
// is a palindrome using Stacks.

import java.util.*; // Scanner

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String response = "y";
        while (response.equals("y")) {
            System.out.print("Which palindrome do you want to check? ");
            String word = console.next();

            Stack<Character> letters = loadStack(word);

            boolean isPalindrome = checkPalindrome(letters);
            if (isPalindrome) {
                System.out.println("That's a palindrome!");
            } else {
                System.out.println("Nope. Not a palindrome.");
            }

            System.out.println();
            System.out.print("Another (y/n)? ");
            response = console.next();
        }

        System.out.println("Thanks for playing!");
        console.close();
    }

    public static Stack<Character> loadStack(String word) {
        Stack<Character> loadedStack = new Stack<Character>();
        for (int i = 0; i < word.length(); i++) {
            loadedStack.push(word.charAt(i));
        }
        return loadedStack;

    }

    public static boolean checkPalindrome(Stack<Character> letters) {
        Stack<Character> tempStack = new Stack<Character>();

        boolean isOdd = false;
        if (letters.size() % 2 == 1){
            isOdd = true;
        }

        int size = letters.size();
        for (int i = 0; i < size/2; i++) {
            tempStack.push(letters.pop());
        }

        if(isOdd){
            letters.pop();
        }

        for (int i = 0; i < size/2; i++) {
            if (!(tempStack.pop() == letters.pop())){
                return false;
            }
        }
        return true;
    }
}
