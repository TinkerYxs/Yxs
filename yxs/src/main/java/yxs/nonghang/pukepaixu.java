/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  pukepaixu.java   
 * @Package yxs.nonghang   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��29�� ����10:56:58   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.nonghang;

import java.util.Comparator;

/**
 * @ClassName: pukepaixu
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��29�� ����10:56:58
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class pukepaixu {

	/**
	 * @Title: pukepaixu @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public pukepaixu() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static class P {
		private char kind;
		private int num;

		/**
		 * @Title: getKind
		 * @Description: please write your description
		 * @return: char
		 */
		public char getKind() {
			return kind;
		}

		/**
		 * @Title: setKind
		 * @Description: please write your description
		 * @return: char
		 */
		public void setKind(char kind) {
			this.kind = kind;
		}

		/**
		 * @Title: getNum
		 * @Description: please write your description
		 * @return: int
		 */
		public int getNum() {
			return num;
		}

		/**
		 * @Title: setNum
		 * @Description: please write your description
		 * @return: int
		 */
		public void setNum(int num) {
			this.num = num;
		}

	}

	public static class cmp implements Comparator<P> {

		/**
		 * <p>
		 * Title: compare
		 * </p>
		 * <p>
		 * Description:
		 * </p>
		 * 
		 * @param var1
		 * @param var2
		 * @return
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
		@Override
		public int compare(P p1, P p2) {
			// TODO Auto-generated method stub
			if (p1.kind == p2.kind) {
				if (p1.num >= p2.num) {
					return 1;
				} else {
					return 0;
				}
			} else {
				if (p1.kind == 'k' && p2.kind == 's' || p2.kind == 'h') {
					return 1;
				}
			}

			return 0;
		}

	}

}
