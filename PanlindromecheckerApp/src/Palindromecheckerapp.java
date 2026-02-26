public class Palindromecheckerapp {
    public static void main(){
        String word = "madam";
        boolean ispalindrome = true;
        int n=word.length()-1;
        for(int i=0; i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(n-i)){
                ispalindrome=false;
                break;
            }
        }
        if(ispalindrome){
            System.out.println(word + "is a palindrome");
        }else{
            System.out.println(word + "is a palindrome");
        }
    }
}
