
public static void main(String[] args) {

    // Input string
    String input = "radar";

    // Convert string to character array
    char[] characters = input.toCharArray();

    // Two-pointer approach
    int start = 0;
    int end = characters.length - 1;

    boolean isPalindrome = true;

    while (start < end) {

        if (characters[start] != characters[end]) {
            isPalindrome = false;
            break;
        }

        start++;
        end--;
    }

    // Display result
    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}


