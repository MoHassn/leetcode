class Solution {
    public int getLucky(String s, int k) {
        int first = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int j = c - 'a' + 1;

            first += j % 10;
            first += (j / 10) % 10;
        }
        int result = first;
        while(k > 1) {
            int temp = result;
            result = 0;
            while(temp > 0) {
                result += temp % 10;
                temp /= 10;
            }
            k--;
        }

        return result;
        
    }
}