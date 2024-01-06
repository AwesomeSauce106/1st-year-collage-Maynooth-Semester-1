public class primeCheck {
    public static void main(String[] args) {
        // setting vars
        int num = 11, i = 2;
        boolean prime = true;

        // setting up do-while loops
        do {
            // checks if the number if divisable by iterator
            if (num % i == 0) {
                // sets prime number to false
                prime = false;
            }
            i++;
        } while (i < num);

        // informs the user if the number if prime or not
        if (prime) {
            System.out.print(num + " is a prime number");
        } else {
            System.out.print(num + " is NOT a prime number");
        }
    }
}
