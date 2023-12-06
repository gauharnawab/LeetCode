package december2023_leetcode;

public class TotalMoney {
    public static int totalMoney(int n) {
        int total = 0;

        for (int day = 0; day < n; day++) {
            total += (day / 7 + 1) + (day % 7);
        }

        return total;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(totalMoney(4));  // Output: 10
        System.out.println(totalMoney(10)); // Output: 37
        System.out.println(totalMoney(20)); // Output: 96
    }
}
