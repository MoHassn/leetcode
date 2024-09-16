class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] converted = new int[timePoints.size()];
        for(int i =0; i < timePoints.size(); i++) {
            String point = timePoints.get(i);
            converted[i] = Integer.parseInt(point.substring(0, 2)) * 60 + Integer.parseInt(point.substring(3));
        }

        Arrays.sort(converted);
        int result = Math.min(converted[1] - converted[0], Math.abs(converted[0] - converted[1]));

        for(int i = 1; i < converted.length; i++) {
            int diff = Math.min(Math.abs(converted[i] - converted[i -1]), Math.abs(converted[i -1] - converted[i]));
            result = Math.min(result, diff);
        }

        int diff = converted[0] + (1440 - converted[converted.length-1]);
            result = Math.min(result, diff);

        
        return result;
    }
}