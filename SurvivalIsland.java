import java.util.*;

public class SurvivalIsland {
    public static void main(String[] args) {
        int S = 10; // total days
        int N = 16; // max food you can buy per day
        int M = 2;  // food needed per day

        if (M > N) {
            System.out.println("No, cannot survive.");
            return;
        }
        if ((M * 7) > (N * 6) && S > 6) {
            System.out.println("No, cannot survive.");
            return;
        }
        int totalFood = S * M;
        int daysToBuy = (int) Math.ceil((double) totalFood / N);
        System.out.println("Yes, can survive. Need to buy food for " + daysToBuy + " days.");
    }
}
