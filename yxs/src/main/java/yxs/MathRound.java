/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  MathRound.java   
 * @Package yxs   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月8日 下午5:20:14   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs;

/**
 * @ClassName: MathRound
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月8日 下午5:20:14
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class MathRound {

	/**
	 * @Title: MathRound @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public MathRound() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float f = 1.233445f;
		System.out.println(f);

		float f1 = (float) Math.round(f * 10) / 10;

		System.out.println(f1);

	}

}
