/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Num1.java   
 * @Package yxs.huawei2021   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月26日 下午5:26:58   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.huawei2021;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName: Num1
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月26日 下午5:26:58
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class Num1 {

	/**
	 * @Title: Num1 @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public Num1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (sc.hasNext()) {
			int x = sc.nextInt();
			list.add(x);

		}

	}

	public static ArrayList<Integer> method(ArrayList<Integer> list) {
		ArrayList<Integer> res = new ArrayList<Integer>();

		return res;
	}

}
