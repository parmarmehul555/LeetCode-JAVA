import java.util.HashMap;
import java.util.Map;

public class MejorityElement {
    public static void main(String[] args) {
        int[] nums = { 1,1,1,2,2,2,3,3,4,4,4,4,5,5,6};
        System.out.println(mejorityElement(nums));
    }

    public static int mejorityElement(int[] nums) {
        int mejorityElementCount = (nums.length - 1) / 2;
        int mejorityNumber = 0; 
        int count = 1;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], count);
            }
        }

        System.out.println(map);

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(mejorityElementCount < entry.getValue()){
                mejorityElementCount = entry.getValue();
                mejorityNumber = entry.getKey();
            }
        }

        return mejorityNumber;
    }
}
