public class restaurantReviews {
    public static void main(String[] args) {
        int stars = 5;

        switch (stars) {
            case 1:
                System.out.println("Poor Quality Restaurant");
                break;
            case 2:
                System.out.println("Below Average Restaurant");
                break;
            case 3:
                System.out.println("Average Quality Restaurant");
                break;
            case 4:
                System.out.println("Very Good Restaurant");
                break;
            case 5:
                System.out.println("Excellent Restaurant");
                break;
            default:
                System.out.println("Not a valid number of stars");
        }
    }
}
