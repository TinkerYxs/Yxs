/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  ReverseString.java   
 * @Package yxs.huawei   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��25�� ����5:36:29   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.huawei;

import java.util.Scanner;

/**
 * @ClassName: ReverseString
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��25�� ����5:36:29
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(method((s)));
	}

	public static String method(String s) {
		StringBuilder res = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			res.append(s.charAt(i));
		}

		return res.toString();
	}

}