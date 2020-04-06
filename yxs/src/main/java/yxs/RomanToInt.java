/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  RomanToInt.java   
 * @Package yxs   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��4��6�� ����4:34:13   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

/**
 * @ClassName: RomanToInt
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��4��6�� ����4:34:13
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class RomanToInt {

	/**
	 * @Title: RomanToInt @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public RomanToInt() {
		// TODO Auto-generated constructor stub
	}

	public int romanToInt(String s) {

		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'I':
				result = result + 1;
				break;
			case 'V':
				if (i > 0 && s.charAt(i - 1) == 'I') {

					result = result + 3;
				} else {
					result = result + 5;
				}
				break;
			case 'X':
				if (i > 0 && s.charAt(i - 1) == 'I') {

					result = result + 8;
				} else {
					result = result + 10;
				}
				break;
			case 'L':
				if (i > 0 && s.charAt(i - 1) == 'X') {

					result = result + 30;
				} else {
					result = result + 50;
				}
				break;
			case 'C':
				if (i > 0 && s.charAt(i - 1) == 'X') {

					result = result + 80;
				} else {
					result = result + 100;
				}
				break;
			case 'D':
				if (i > 0 && s.charAt(i - 1) == 'C') {

					result = result + 300;
				} else {
					result = result + 500;
				}
				break;
			case 'M':
				if (i > 0 && s.charAt(i - 1) == 'C') {

					result = result + 800;
				} else {
					result = result + 1000;
				}
				break;

			default:
				break;
			}
		}

		return result;

	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 * void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
