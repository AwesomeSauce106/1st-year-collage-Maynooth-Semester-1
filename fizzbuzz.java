public class fizzbuzz {
    public static void main(String[] args) {
        // setting vars
        int start = 10, end = 15;

        // loops to check numbers
        for (int i = start; i <= end; i++) {

            if (i % 3 == 0 && i % 5 == 0) { // checks if the number is divisable by 3 & 5
                System.out.println("fizzbuzz ");
            } else if (i % 3 == 0) { // checks if the number is divisable by 3
                System.out.println("fizz ");
            } else if (i % 5 == 0) { // checks if the number is divisable by 5
                System.out.println("buzz ");
            } else {
                System.out.println(i + " "); // if the number is not divisable by 3 or 5
            }
        }
    }
}
