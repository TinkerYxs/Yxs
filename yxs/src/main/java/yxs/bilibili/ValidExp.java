/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  ValidExp.java   
 * @Package yxs   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月13日 下午8:06:21   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.bilibili;

import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName: ValidExp
 * @Description:2020-08-13bilibili笔试题
 * @author: 元晓帅
 * @date: 2020年8月13日 下午8:06:21
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class ValidExp {

	public static Stack<Character> stack = new Stack<Character>();

	/**
	 * @Title: ValidExp @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public ValidExp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			if (string == null) {
				System.out.println(true);
			}
			System.out.println(IsValidExp(string));
		}

	}

	public static boolean IsValidExp(String s) {

		char[] cs = s.toCharArray();
		boolean flag = false;
		if (s.equals("")) {
			flag = true;
			return flag;
		} else {
			int i = 0;
			while (i < s.length()) {
				if ('(' == cs[i] || '{' == cs[i] || '[' == cs[i]) {
					stack.push(cs[i]);
					i++;
					continue;
				}
				if (')' == cs[i] || '}' == cs[i] || ']' == cs[i]) {
					if (stack.size() == 0) {
						i++;
						flag = false;
						return flag;
					}
					char c = stack.peek();
					if ((c == '(' && cs[i] == ')') || (c == '[' && cs[i] == ']') || (c == '{' && cs[i] == '}')) {
						stack.pop();
						i++;
						continue;
					} else {
						i++;
						flag = false;
						return flag;
					}
				}
			}
		}

		if (stack.size() == 0) {
			flag = true;
		}
		return flag;
	}

}
