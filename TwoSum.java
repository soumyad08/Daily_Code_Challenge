import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSumoGivenArray(int []nums, int target){
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i  = 0; i < n; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        TwoSum ts = new TwoSum();
        int []result = ts.twoSumoGivenArray(new int[]{2,3,11,15,7}, 9);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
