/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  pukepaixu2.java   
 * @Package yxs.nonghang   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月29日 上午11:11:23   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.nonghang;

import java.util.Arrays;

/**
 * @ClassName: pukepaixu2
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月29日 上午11:11:23
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class pukepaixu2 {

	/**
	 * @Title: pukepaixu2 @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public pukepaixu2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String[] strings = { "k1", "p2", "q3", "k2", "h2", "p3", "s12" };

		String[] reStrings = method(strings);
		System.out.println(Arrays.toString(reStrings));

	}

	public static String[] method(String[] s) {

		for (int i = 0; i < s.length; i++) {
			if (s[i].charAt(0) == 'k') {
				s[i] = s[i].replace('k', 'a');

			}
			if (s[i].charAt(0) == 's') {
				s[i] = s[i].replace('s', 'b');
			}
			if (s[i].charAt(0) == 'h') {
				s[i] = s[i].replace('h', 'c');
			}
			if (s[i].charAt(0) == 'p') {
				s[i] = s[i].replace('p', 'd');
			}
			if (s[i].charAt(0) == 'q') {
				s[i] = s[i].replace('q', 'e');
			}
		}

		Arrays.sort(s);

		for (int i = 0; i < s.length; i++) {
			if (s[i].charAt(0) == 'a') {
				s[i] = s[i].replace('a', 'k');
			}
			if (s[i].charAt(0) == 'b') {
				s[i] = s[i].replace('b', 's');
			}
			if (s[i].charAt(0) == 'c') {
				s[i] = s[i].replace('c', 'h');
			}
			if (s[i].charAt(0) == 'd') {
				s[i] = s[i].replace('d', 'p');
			}
			if (s[i].charAt(0) == 'e') {
				s[i] = s[i].replace('e', 'q');
			}
		}

		return s;

	}

}
