/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Reverse.java   
 * @Package yxs   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��4��6�� ����4:31:33   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

/**
 * @ClassName: Reverse
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��4��6�� ����4:31:33
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Reverse {

	/**
	 * @Title: Reverse @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public Reverse() {
		// TODO Auto-generated constructor stub
	}

	public int reverse(int x) {

		int res = 0;
		int i = 0;
		int y = x;
		while (x != 0) {

			x = (x - x % 10) / 10;
			i++;

		}

		for (int j = i; j > 0; j--) {

			int t = y % 10;

			res = (int) (res + t * Math.pow(10, j - 1));

			y = (y - y % 10) / 10;

		}
		if (res == 2147483647) {
			res = 0;
		}
		if (res == -2147483648) {
			res = 0;
		}

		return res;
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 * void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
