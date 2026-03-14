package leetcode.strings;
/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        //creates the new messsage with only numbers or digits
        if(s.equals("")){
            return true;
        }
        s = s.toLowerCase();
        s = s.replace(" ", "");
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                text.append(c);
            }
        }
        System.out.println("\n"+ text);
        String forward = text.toString();
        String reverse = text.reverse().toString();
        return reverse.equals(forward);
    }
}
