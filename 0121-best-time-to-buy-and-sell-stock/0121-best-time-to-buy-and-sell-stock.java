class Solution {
    public int maxProfit(int[] prices) {
        int mx=0,low=Integer.MAX_VALUE;
        int mxp=0,lp=0;
        for(int i=0;i<prices.length;i++){
           
         if(low>prices[i]){

         low=prices[i]; lp=i; }
         if(prices[i]-low>mx){
              mx=prices[i]-low;
         }
        }
       
          return mx;
         
    }
}