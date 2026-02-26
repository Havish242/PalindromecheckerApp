public class Palindromecheckerapp {
    public static void main(){
        String word = "madam ";
        boolean ispalindrome = true;
        int n=word.length()-1;
        int start =0;
        for(int i=n; i>0;i--){
            if(word.charAt(i)!=word.charAt(start)){
                ispalindrome = false;
                break;
            }
            start++;
        }
        if(ispalindrome){
            System.out.println(word + "is a palindrome");
        }else{
            System.out.println(word + "is a palindrome");
        }
    }
}
