/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  TestReceiveMsQueue.java   
 * @Package yxs.springjms   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��12�� ����8:40:33   
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
 * @Description:���Ե�Ե������Ϣ
 * @author: Ԫ��˧
 * @date: 2020��8��12�� ����8:40:33
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/yxs/springjms/applicationContext-jms-consumer-queue.xml")
public class TestReceiveMsQueue {

	/**
	 * @Title: TestReceiveMsQueue @Description:
	 *         TODO(������һ�仰�����������������) @param: @throws
	 */

	@Test
	public void testQueue() {
		try {
			// ��δ������˼ֻ����ͣ����������м���
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
