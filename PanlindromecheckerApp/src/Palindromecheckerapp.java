import java.util.*;

public class Palindromecheckerapp {
    public static void main(String[] args) {
        String word = "refer";
        Deque<Character> deque = new ArrayDeque<>();
        boolean ispalindrome = true;

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                ispalindrome = false;
                break;
            }
        }

        if (ispalindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}