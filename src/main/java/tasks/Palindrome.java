package tasks;

public class Palindrome {
    public static void main(String [] args){
        Palindrome palindrome = new Palindrome();
            if (palindrome.isPalindrome("level")) {
            System.out.println("This is palindrome");
             } else {
            System.out.println("This is not palindrome");
            }
    }

    public boolean isPalindrome(String inpuData){
        int i = inpuData.length()-1;
        int j=0;

        while(i > j) {
            if(inpuData.charAt(i) != inpuData.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
