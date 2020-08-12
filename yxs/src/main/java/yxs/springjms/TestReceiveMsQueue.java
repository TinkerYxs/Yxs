/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  TestReceiveMsQueue.java   
 * @Package yxs.springjms   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月12日 下午8:40:33   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.springjms;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: TestReceiveMsQueue
 * @Description:测试点对点接收消息
 * @author: 元晓帅
 * @date: 2020年8月12日 下午8:40:33
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/yxs/springjms/applicationContext-jms-consumer-queue.xml")
public class TestReceiveMsQueue {

	/**
	 * @Title: TestReceiveMsQueue @Description:
	 *         TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */

	@Test
	public void testQueue() {
		try {
			// 这段代码的意思只是让停留正在这进行监听
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
