class Solution {
    public int[] finalPrices(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < answer.length; i++) {
            int discount = 0;
            for(int j= i+1; j < prices.length; j++) {
                if(prices[i] >= prices[j]) {
                    discount = prices[j];
                    break;
                }
            }
            answer[i] = prices[i] - discount;

        }
        return answer;
        
    }
}