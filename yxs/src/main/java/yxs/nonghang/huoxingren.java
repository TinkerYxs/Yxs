/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  huoxingren.java   
 * @Package yxs.nonghang   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��29�� ����10:08:44   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.nonghang;

import java.util.Scanner;

/**
 * @ClassName: huoxingren
 * @Description:TODO(������һ�仰��������������)
 * @author: Ԫ��˧
 * @date: 2020��8��29�� ����10:08:44
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class huoxingren {

	/**
	 * @Title: huoxingren @Description: TODO(������һ�仰�����������������) @param: @throws
	 */
	public huoxingren() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(������һ�仰�����������������) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		System.out.println(fun(num));

	}

	public static String fun(int num) {

		String str = "";
		int yushu; // ��������
		int shang = num; // ������
		while (shang > 0) {
			yushu = shang % 3;
			shang = shang / 3;
			if (yushu == 0) {
				str = "@" + str;
			} else if (yushu == 1) {
				str = "$" + str;
			} else if (yushu == 2) {
				str = "&" + str;
			}

		}

		return str;
	}

}
