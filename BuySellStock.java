public class BuySellStock {
    public static int findprofit(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit =0;
        int n = prices.length;
        for(int i =0; i<n;i++){

            if(prices[i]<buyprice){
                buyprice= prices[i];
            }
            int profit =  prices[i]-buyprice;
            if(profit>maxprofit){
                maxprofit = profit;
            }
        }
        return maxprofit;

    }
    public static void main(String[] args) {
        int prices[] ={7,1,2,1,4,6,0};
        System.out.println(findprofit(prices));
    }
}
