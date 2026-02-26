import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindromecheckerapp {
    public static void main(){
        String word = "civic";
        char[]chars = word.toCharArray();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        boolean ispalindrome = true;
        for (char c: word.toCharArray()){
            stack.push(c);
            queue.add(c);
        }
        while(!queue.isEmpty()){
            if(!queue.remove().equals(stack.pop())){
                ispalindrome = false;
                break;
            }

        }
        if(ispalindrome){
            System.out.println(word + "is a palindrome");
        }else{
            System.out.println(word + " is a not palindrome");
        }
    }
}
