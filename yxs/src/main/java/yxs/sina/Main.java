/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Main.java   
 * @Package yxs.sina   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��9��13�� ����4:36:25   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.sina;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName: Main
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��9��13�� ����4:36:25
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		if (method(string)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	public static boolean method(String string) {

		char[] cs = string.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < cs.length; i++) {
			set.add(cs[i]);
		}
		if (cs.length == set.size()) {
			return true;
		} else {
			return false;
		}

	}

}
