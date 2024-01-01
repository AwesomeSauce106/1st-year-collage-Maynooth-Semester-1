public class busFares {
    public static void main(String[] args) {
        char passenger = 'A';
        double fare1 = 2.05, fare2 = 0.65;

        boolean result = passenger == 'A' ? true : false;

        if (result) {
            System.out.println("The fare is: €" + fare1);
        } else {
            System.out.println("The fare is: €" + fare2);
        }
    }
}
