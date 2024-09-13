class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix =  new int[arr.length + 1];
        prefix[0] = 0;
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = arr[i-1] ^ prefix[i-1];
        }

        int[] result = new int[queries.length];
        for(int i =0; i < queries.length; i++) {
            result[i] = prefix[queries[i][0]] ^ prefix[queries[i][1] + 1];
        }

        return result;
        
        
    }
}