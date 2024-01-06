// this programe gets an inital number doubles it each day for the savings
public class centPincher {
    public static void main(String[] args) {
        // sets vars
        int days = 4, i = 1, num1 = 1, totalNum = 1;

        // loops for the given amount of days
        while (i < days) {
            // doubles initial number
            num1 *= 2;
            // adds the number onto total
            totalNum += num1;
            // itterates to the next day
            i++;
        }
        // prints out final value
        System.out.println(totalNum);
    }
}
