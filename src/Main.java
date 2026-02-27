
public static void main(String[] args) {

    // Input string
    String input = "noon";

    // Create Stack
    Stack<Character> stack = new Stack<>();

    // Push characters into stack
    for (int i = 0; i < input.length(); i++) {
        stack.push(input.charAt(i));
    }

    boolean isPalindrome = true;

    // Pop and compare
    for (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) != stack.pop()) {
            isPalindrome = false;
            break;
        }
    }

    // Required Output Format
    System.out.println("Input : " + input);
    System.out.println("Is palindrome? : " + isPalindrome);
}

