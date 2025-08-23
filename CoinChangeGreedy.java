import java.util.Arrays;

public class CoinChangeGreedy {
    public static int coinChangeGreedy(int[] coins, int amount) {
        Arrays.sort(coins); // sort in ascending order
        int count = 0;
        
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }
        
        if (amount != 0) {
            System.out.println("Cannot form amount using given coins.");
            return -1;
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000}; // Indian coins
        int amount = 93;

        int result = coinChangeGreedy(coins, amount);
        System.out.println("Minimum coins needed: " + result);
    }
}
