/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  NiuNiuPuke2.java   
 * @Package yxs.zhongxing2021.zt   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��27�� ����11:26:00   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.zhongxing2021.zt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: NiuNiuPuke2
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��27�� ����11:26:00
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class NiuNiuPuke2 {

	/**
	 * @Title: NiuNiuPuke2 @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public NiuNiuPuke2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Pai> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String string = scanner.nextLine();
			String[] strings = string.split(" ");
			Pai pai = null;
			pai.setA(strings[0]);
			pai.setB(strings[1]);
			pai.setC(strings[2]);
			method(list);
		}

	}

	public static int method(ArrayList<Pai> list) {

		int res = 0;

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				for (int k = j + 1; k < list.size(); k++) {
					if (list.get(i).getA().equals(list.get(j).getA())
							&& list.get(j).getA().equals(list.get(k).getA())) {

					}
				}
			}
		}
		return res;

	}

	class Pai {
		/**
		 * * @Title: NiuNiuPuke2.Paid @Description:
		 * TODO(������һ�仰�����������������) @param: @throws
		 */

		// TODO Auto-generated constructor stub
		String a;
		String b;
		String c;

		/**
		 * @Title: getA
		 * @Description: please write your description
		 * @return: String
		 */
		public String getA() {
			return a;
		}

		/**
		 * @Title: setA
		 * @Description: please write your description
		 * @return: String
		 */
		public void setA(String a) {
			this.a = a;
		}

		/**
		 * @Title: getB
		 * @Description: please write your description
		 * @return: String
		 */
		public String getB() {
			return b;
		}

		/**
		 * @Title: setB
		 * @Description: please write your description
		 * @return: String
		 */
		public void setB(String b) {
			this.b = b;
		}

		/**
		 * @Title: getC
		 * @Description: please write your description
		 * @return: String
		 */
		public String getC() {
			return c;
		}

		/**
		 * @Title: setC
		 * @Description: please write your description
		 * @return: String
		 */
		public void setC(String c) {
			this.c = c;
		}
	}

}
