/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  xxxxxxx.java   
 * @Package yxs.alibaba   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月29日 上午9:48:28   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.nonghang;

/**
 * @ClassName: xxxxxxx
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月29日 上午9:48:28
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class xxxxxxx {

	/**
	 * @Title: xxxxxxx @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public xxxxxxx() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 * void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 5;
			int b = 0;
			System.out.println(a / b);

		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			System.out.println("end!");
		}
	}

}
