import java.util.Stack;

public class Palindromecheckerapp {
    public static void main(){
        String word = "noon ";
        char[]chars = word.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean ispalindrome = true;
        for (char c: word.toCharArray()){
            stack.push(c);
        }
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=stack.pop()){
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
