public class Palindromecheckerapp {
    public static void main(){
        String word = "rader";
        char[]chars = word.toCharArray();
        boolean ispalindrome = true;
        int end =chars.length-1;
        int start =0;
        while(start < end){
            if(word.charAt(end)!=word.charAt(start)){
                ispalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(ispalindrome){
            System.out.println(word + "is a palindrome");
        }else{
            System.out.println(word + " is a not palindrome");
        }
    }
}
