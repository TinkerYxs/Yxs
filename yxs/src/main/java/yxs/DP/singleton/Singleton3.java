/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  Singleton3.java   
 * @Package yxs.DP.singleton   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月31日 下午4:37:37   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.DP.singleton;

/**
 * @ClassName: Singleton3
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 元晓帅
 * @date: 2020年8月31日 下午4:37:37
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
// 饿汉，线程安全
public class Singleton3 {
	private static Singleton3 instance = new Singleton3();

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		return instance;
	}
}
