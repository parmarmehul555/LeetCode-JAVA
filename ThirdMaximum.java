import java.util.HashSet;
import java.util.PriorityQueue;

class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums){
            if(set.add(num)) {
                pq.offer(num);
                if(pq.size() > 3) {
                    pq.poll(); // Remove the smallest element
                }
            }
        }
        
        if(pq.size() == 2) {
            pq.poll(); // If there are only 2 distinct elements, remove the smaller one
        }
        
        return pq.peek();
    }
}