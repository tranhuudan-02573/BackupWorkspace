package Code;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
			int comp = target - nums[i];
//			System.out.println(map);
			if (map.containsKey(comp)) {
				System.out.println(map);
				int[] result = { map.get(comp), i };
				System.out.println(map.get(comp) + "  " + i);
				return result;
			}

		}
		throw new IllegalArgumentException("no two sum solution");
	}

	public static void main(String[] args) {
		TwoSum tw = new TwoSum();
		int[] i = { 7, 5, 4, 11, 15 };
		System.out.println(tw.twoSum(i, 9));
	}
}
