/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Solution.java   
 * @Package yxs.vivo2021   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��9��12�� ����8:50:13   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.vivo2021;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName: Solution
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��9��12�� ����8:50:13
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Solution {

	public static void main(String[] args) {

	}

	public String compileSeq(String input) {

		String[] strings = input.split(",");

		Stack<Integer> stack = new Stack<>();

		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < strings.length; i++) {
			int a = Integer.valueOf(strings[i]);
			if (stack.isEmpty()) {
				stack.push(a);
			} else {

				if (a == -1) {
					stack.push(a);
				} else {

				}
			}
		}

		return "";
	}

}
