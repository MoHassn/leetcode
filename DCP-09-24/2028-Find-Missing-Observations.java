class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = (n + rolls.length) * mean;
        for(int i = 0; i < rolls.length; i++) {
            sum -= rolls[i]; 
        }
        if(sum > n * 6 || sum < n * 1) return new int[0];

        int[] result = new int[n]; 
        int value = sum/n;
        for(int i = 0; i < result.length; i++) {
            result[i] = value;
        }
        int p = 0;
        int remainder = sum % n;
        while(remainder > 0) {
            int temp = 6 - result[p];
            if(remainder < temp) {
                result[p] += remainder;
                break;
            }

            result[p] = 6;
            remainder -= temp;
            p++;
        }
        return result;


        
    }
}