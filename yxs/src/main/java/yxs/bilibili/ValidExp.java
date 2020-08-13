/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  ValidExp.java   
 * @Package yxs   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��13�� ����8:06:21   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.bilibili;

import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName: ValidExp
 * @Description:2020-08-13bilibili������
 * @author: Ԫ��˧
 * @date: 2020��8��13�� ����8:06:21
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class ValidExp {

	public static Stack<Character> stack = new Stack<Character>();

	/**
	 * @Title: ValidExp @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public ValidExp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
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
