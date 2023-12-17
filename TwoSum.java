public class TwoSum{
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] nums = {2,7,11,1};
        int[] finalArr = s1.twoSum(nums,9);
        for(int temp : finalArr)
            System.out.println(temp);
    }    
}

class Solution{
    public int[] twoSum(int[] nums,int target){
        int[] finalArr = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                int a=nums[i];
                int b=nums[j];
                if((a+b) == target){
                    finalArr[0] = i;
                    finalArr[1] = j;
                    break;
                }
            }
        }
        return finalArr;
    }
}