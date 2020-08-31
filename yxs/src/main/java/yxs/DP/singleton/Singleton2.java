/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Singleton2.java   
 * @Package yxs.DP.singleton   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月31日 下午4:36:30   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.DP.singleton;

/**
 * @ClassName: Singleton2
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月31日 下午4:36:30
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
// 懒汉 线程安全
public class Singleton2 {
	private static Singleton2 instance;

	private Singleton2() {
	}

	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}
