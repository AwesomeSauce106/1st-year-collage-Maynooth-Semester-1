public class fibonacci {
    public static void main(String[] args) {
        // setting varibles
        int num = 11, value1 = 0, value2 = 1, sumOfPrev2 = 0, i = 1;

        // runs until itterator reaches value
        while (i < num) {
            // prints initial number
            System.out.println(value1 + " ");

            // gets sum of numbers 1&2
            sumOfPrev2 = value1 + value2;
            // sets value of value1 to next num in sequence
            value1 = value2;
            // sets value2 to next number for sequence
            value2 = sumOfPrev2;
            // itterates to the next step
            i++;
        }
        // prints final value
        System.out.println(value1);
    }
}
