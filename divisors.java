public class divisors {
    public static void main(String[] args) {
        // setting vars
        int num = 24;

        // loops to find factors of a number
        for (int i = 1; i <= num; i++) {
            // checks if the number is divisable by the iterator
            if (num % i == 0) {
                System.out.print(i + ","); // the number if divisable
            }
        }
    }
}
