/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main2.java   
 * @Package yxs.iqiyi   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年9月13日 下午4:00:27   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.iqiyi;

import java.util.Scanner;

/**
 * @ClassName: Main2
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年9月13日 下午4:00:27
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split(" ");

		int[] nums = new int[strings.length];

		for (int i = 0; i < strings.length; i++) {
			nums[i] = Integer.valueOf(strings[i]);
		}
		int cur = nums[0];
		int curCount = 1;
		for (int i = 1; i < nums.length; i++) {
			if (curCount == 0) {
				curCount = 1;
				cur = nums[i];
			} else if (cur == nums[i]) {
				curCount++;
			} else {
				curCount--;
			}
		}

		System.out.println(cur);

	}

}
