class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            int current = nums[i];
            int value = target - current;
            if(map.containsKey(value)){
                return new int[]{map.get(value),i};
            }
            map.put(current,i);
        }
        return new int[0];
    }
}
