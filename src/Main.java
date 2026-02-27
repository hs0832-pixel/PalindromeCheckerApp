


    public static void main(String[] args) {

        // Hardcoded string
        String text = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        // Check if palindrome
        boolean isPalindrome = text.equals(reversed);

        // Display output in required format
        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }


