/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  IsPalindrome.java   
 * @Package yxs   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��4��6�� ����4:33:08   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: IsPalindrome
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��4��6�� ����4:33:08
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class IsPalindrome {

	/**
	 * @Title: IsPalindrome @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public IsPalindrome() {
		// TODO Auto-generated constructor stub
	}

	public boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		} else {

			int xlength = 0;
			int xc = x;
			while (xc != 0) {

				xc = (xc - xc % 10) / 10;

				xlength++;

			}
			List<Integer> y = new ArrayList<Integer>();
			for (int i = 0; i < xlength / 2; i++) {
				y.add(x % 10);
				x = (x - x % 10) / 10;
				System.out.println("y" + i + ": " + y.get(i));
				System.out.println("X: " + x);
			}

			if (xlength % 2 != 0) {
				x = (x - x % 10) / 10;
				System.out.println("x: " + x);
			}
			for (int j = xlength / 2 - 1; j >= 0; j--) {

				System.out.println(x % 10 + "   " + y.get(j));
				if ((x % 10) != y.get(j)) {
					return false;
				} else {
					x = (x - x % 10) / 10;
				}

			}
			System.out.println("xLength:  " + xlength);
			return true;
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
