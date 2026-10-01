class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxWater = 0;
        while(left<right){
            int currWater = Math.min(heights[left],heights[right])*(right-left);
            maxWater = Math.max(maxWater,currWater);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}
