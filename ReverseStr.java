public class ReverseStr {
    public static String reverseString(String input){
        // Brute Force Approach
        // Time Complexity: O(n^2) because each time string concatenation create a new string.
        // Space Complexity: O(n) new string for result.
//        String rev = "";
//        for(int i = input.length() - 1; i >= 0; i --){
//            rev += input.charAt(i);
//        }
//        return rev;

        // Optimized Approach
        // Time Complexity: O(n) because each character is visited least once.
        // Space Complexity: O(n) because char[] is used, which has same size.
        char [] chars = input.toCharArray();
        int left = 0; int right = chars.length - 1;
        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;


            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "ABBDEB";
        System.out.println("The Revere Str is: " + reverseString(str));
    }
}
