import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        for (char c : str.toCharArray()) if (c != stack.pop()) return false;
        return true;
    }

    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) deque.add(c);
        while (deque.size() > 1) if (deque.removeFirst() != deque.removeLast()) return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Performance Comparison ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        long startTime, endTime;

        startTime = System.nanoTime();
        boolean recResult = recursivePalindrome(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        System.out.println("Recursive: " + recResult + " | Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        endTime = System.nanoTime();
        System.out.println("Stack: " + stackResult + " | Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        endTime = System.nanoTime();
        System.out.println("Deque: " + dequeResult + " | Time: " + (endTime - startTime) + " ns");

        scanner.close();
    }
}