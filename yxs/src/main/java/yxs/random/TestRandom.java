/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  TestRandom.java   
 * @Package yxs.random   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月28日 下午4:45:21   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.random;

import java.util.Random;

/**
 * @ClassName: TestRandom
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月28日 下午4:45:21
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
public class TestRandom {

	/**
	 * @Title: TestRandom @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public TestRandom() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 * void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(); // 根据当前系统的时间作为随机数种子，创建一个随机数生成器

		System.out.println(random.nextInt(10));

	}

}
