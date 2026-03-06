import java.util.*;

public class Palindromecheckerapp {
    public static void main(String[] args) {
        String word = "level";
        LinkedList<Character> list= new LinkedList<>();
        boolean ispalindrome = true;

        for (char c : word.toCharArray()) {
            list.addLast(c);
        }

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
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