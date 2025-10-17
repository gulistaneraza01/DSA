package leetcode;

import java.util.Arrays;

public class BestTimetoBuyandSellStock121 {

    // Time Complexcity -- O(n^2)
    // Space Complexcity -- O(1)

    // public static int bestTimeToBuyandSelellStock(int[] prices) {
    // int n = prices.length;
    // int maxProfit = 0;

    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < n; j++) {
    // int profit = prices[j] - prices[i];
    // if (maxProfit < profit) {
    // maxProfit = profit;
    // }
    // }
    // }
    // return maxProfit;
    // }

    // Time Complexcity -- O(n)
    // Space Complexcity -- O(1)
    public static int bestTimeToBuyandSelellStock(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 34, 2, 5, 6, 2, 43,34,3,34,3 };
        int res = bestTimeToBuyandSelellStock(nums);
        System.out.println(res);

    }
}