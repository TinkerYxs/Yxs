/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  InputOuput.java   
 * @Package yxs.test   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��21�� ����11:35:09   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.test;

import java.util.Scanner;

/**
 * @ClassName: InputOuput
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��21�� ����11:35:09
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class InputOuput {

	/**
	 * @Title: InputOuput @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public InputOuput() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
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
