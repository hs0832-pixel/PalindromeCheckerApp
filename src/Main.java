public static void main(String[] args) {

    // Input string
    String input = "refer";

    // Create Deque
    Deque<Character> deque = new ArrayDeque<>();

    // Insert characters into deque
    for (int i = 0; i < input.length(); i++) {
        deque.addLast(input.charAt(i));
    }

    boolean isPalindrome = true;

    // Compare front and rear elements
    while (deque.size() > 1) {
        char front = deque.removeFirst();
        char rear = deque.removeLast();

        if (front != rear) {
            isPalindrome = false;
            break;
        }
    }

    // Required Output Format
    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
}