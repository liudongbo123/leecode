package InJava;

import java.util.*;

/**
 * @author liudongbo05 <liudongbo05@kuaishou.com>
 * Created on 2020-10-15
 */
public class Q3 {
	// 原地哈希， 空间O(1） ， 时间O(n), 没有额外的开销
	// 或者外加一个集合 Set = new HashSet，  空间O(n), 时间O(n)
	public static int findRepeatNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == nums[nums[i]]){
				if(i == nums[i]){
					continue;
				}else {
					return nums[i];
				}
			}else {
				int tmp = nums[i];
				nums[i] =  nums[tmp];
				nums[tmp] = tmp;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums =  new int[20];
		Scanner scanner = new Scanner(System.in);

		for (int j = 0; j < 7; j++) {
			nums[j] = scanner.nextInt();
		}
		System.out.println(findRepeatNumber(nums));
	}
}
