
public static void main(String[] args) {

    // Input string
    String input = "civic";

    // Create Queue (FIFO)
    Queue<Character> queue = new LinkedList<>();

    // Create Stack (LIFO)
    Stack<Character> stack = new Stack<>();

    // Enqueue and Push characters
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        queue.add(ch);     // Enqueue
        stack.push(ch);    // Push
    }

    boolean isPalindrome = true;

    // Compare dequeue and pop
    while (!queue.isEmpty()) {
        if (queue.remove() != stack.pop()) {
            isPalindrome = false;
            break;
        }
    }

    // Required Output Format
    System.out.println("Input : " + input);
    System.out.println("Is palindrome? : " + isPalindrome);
}

