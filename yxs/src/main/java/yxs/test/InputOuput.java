/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  InputOuput.java   
 * @Package yxs.test   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月21日 上午11:35:09   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.test;

import java.util.Scanner;

/**
 * @ClassName: InputOuput
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月21日 上午11:35:09
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class InputOuput {

	/**
	 * @Title: InputOuput @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public InputOuput() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String[] string = scanner.nextLine().split("\\.");
			System.out.println(string.length);
		}
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println("\n" + "ssssssss" + "\n");
		while (scanner.hasNextLine()) {

			String string = scanner.nextLine();
			System.out.println(string);
		}

	}

}
