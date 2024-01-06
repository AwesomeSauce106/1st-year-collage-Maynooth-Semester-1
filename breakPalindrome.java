public class breakPalindrome {
    public static void main(String[] args) {

        // sets vars for storing nums
        int num1, num2, num3, num4, num5;

        // loops to look for palindromes
        for (int i = 10000; i < 99999; i++) {
            if (i % 53 == 0) {
                num5 = i % 10;
                num4 = (i / 10) % 10;
                num3 = (i / 100) % 10;
                num2 = (i / 1000) % 10;
                num1 = (i / 10000) % 10;

                // checks if the number is palindrome and prints
                if (num1 == num5 && num2 == num4) {
                    System.out.println(i);
                    System.out.println(num1);
                    System.out.println(num2);
                    System.out.println(num3);
                    System.out.println(num4);
                    System.out.println(num5);
                    System.out.println("**********");
                }
            }
        }
    }
}
