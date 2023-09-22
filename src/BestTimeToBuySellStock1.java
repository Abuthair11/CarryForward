import java.util.Scanner;

public class BestTimeToBuySellStock1  {
    public static int findProfit(int[] Arr){
        int max = Arr.length-1;
        int profit = 0 ;
        for(int i = Arr.length-2; i >=0 ;i--){
            if(Arr[i] >max){
                max = Arr[i];
            }
            profit   = Math.max(profit,max-Arr[i]);
        }

   return profit;
    }

    public static void main(String[] args) {

       int A [] = {1, 4, 5, 2, 4};

       int ans;
        ans = findProfit(A);
        System.out.println(ans);
    }

}
