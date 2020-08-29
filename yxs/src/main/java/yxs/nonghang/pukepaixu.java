/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  pukepaixu.java   
 * @Package yxs.nonghang   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月29日 上午10:56:58   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.nonghang;

import java.util.Comparator;

/**
 * @ClassName: pukepaixu
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月29日 上午10:56:58
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class pukepaixu {

	/**
	 * @Title: pukepaixu @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public pukepaixu() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
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
