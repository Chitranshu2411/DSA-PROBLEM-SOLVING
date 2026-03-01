class Solution {
    public int majorityElement (int[] nums){
    int n = nums.length;
    int count = 0;
    Integer majority = null;

    for ( int i = 0; i<n; i++){
        if ( count == 0){
            count = 1;
            majority = nums[i];
        } else if (nums[i] == majority){
            count++;
        } else {
            count--;
        }
    } 
    return majority ;
    }
}