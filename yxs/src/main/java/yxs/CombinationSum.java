/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  CombinationSum.java   
 * @Package yxs   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��4��6�� ����4:36:29   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: CombinationSum
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��4��6�� ����4:36:29
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class CombinationSum {

	/**
	 * @Title: CombinationSum @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public CombinationSum() {
		// TODO Auto-generated constructor stub
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> result = new LinkedList<>();
		LinkedList<Integer> list = new LinkedList<>();
		Arrays.sort(candidates);

		Sum(candidates, 0, target, list, result);

		return result;

	}

	public static void Sum(int[] candidates, int start, int target, LinkedList<Integer> list,
			List<List<Integer>> result) {

		if (target == 0) {
			result.add(new LinkedList<>(list));
			return;
		}

		for (int i = start; i < candidates.length; i++) {

			if (candidates[i] > target) {
				break;
			}
			list.add(candidates[i]);
			Sum(candidates, i, target - candidates[i], list, result);

			list.removeLast();

		}

	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
