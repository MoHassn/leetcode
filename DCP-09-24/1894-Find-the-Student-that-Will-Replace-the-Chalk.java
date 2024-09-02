class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long[] prfix = new long[chalk.length];
        prfix[0] = chalk[0];
        for(int i  = 1; i < prfix.length; i++) {
            prfix[i] = chalk[i] + prfix[i-1];
        }
        while(k > prfix[prfix.length-1]) {
            k -= prfix[prfix.length-1];
        }
        System.out.println(k);
        for(int i = prfix.length-1; i > 0; i--) {
            if(prfix[i] > k && prfix[i -1] <=k) return i;
        }
        return 0;
        
    }
}