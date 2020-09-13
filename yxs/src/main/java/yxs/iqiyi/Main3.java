/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main3.java   
 * @Package yxs.iqiyi   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月13日 下午4:06:38   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.iqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split(" ");

		int[] nums = new int[strings.length];

		for (int i = 0; i < strings.length; i++) {
			nums[i] = Integer.valueOf(strings[i]);
		}

		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i).get(0) + " " + res.get(i).get(1) + " " + res.get(i).get(2));
		}

	}

	static List<List<Integer>> res = new ArrayList<List<Integer>>();

	public static List<List<Integer>> method(int[] nums) {

		int len = nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < len; i++) {
			if (nums[i] > 0) {
				break;
			}
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int target = 0 - nums[i];
			int l = i + 1, r = len - 1;
			while (l < r) {
				List<Integer> list = new ArrayList<>();
				if (nums[l] + nums[r] == target) {
					list.add(nums[i]);
					list.add(nums[l]);
					list.add(nums[r]);
					res.add(list);
					while (r > l && nums[l + 1] == nums[l])
						l++;
					while (r > l && nums[r] == nums[r - 1])
						r--;
					l++;
					r--;
				} else if (nums[l] + nums[r] > target) {
					r--;
				} else {
					l++;
				}
			}
		}

		return res;
	}
}
