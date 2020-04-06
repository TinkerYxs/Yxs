/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  TwoSum.java   
 * @Package yxs   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年4月6日 下午4:13:45   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

/**
 * @ClassName: TwoSum
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年4月6日 下午4:13:45
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class TwoSum {

	/**
	 * @Title: TwoSum @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public TwoSum() {
		// TODO Auto-generated constructor stub
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] index = { -1, -1 };
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int sum = nums[i] + nums[j];
				if (target == sum) {
					index[0] = i;
					index[1] = j;
					return index;
				}
			}

		}
		return index;

	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(twoSum(nums, 10)[0]);
		System.out.println(twoSum(nums, 10)[1]);
	}

}
