public class BuySellStock {

    public int buySellStock(int [] arr , int n)
    {
        int buy = arr[0];
        int maxProfit = 0;

        for (int i =1;i< n;i++)
        {
            if(buy > arr[i])
            {
                buy = arr[i];
            } else if (maxProfit < arr[i] - buy) {
                maxProfit = arr[i] - buy;
            }
        }

        return maxProfit; // GREEDY APPROACH
    }

    public static void main(String args[])
    {
        int prices[] = { 7, 1, 5, 6, 4 };
        int n = prices.length;
        BuySellStock buySellStock = new BuySellStock();
        int max_profit = buySellStock.buySellStock(prices, n);
        System.out.println(max_profit);
    }
}
