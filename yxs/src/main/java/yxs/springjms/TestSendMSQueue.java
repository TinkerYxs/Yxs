/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  TestQueue.java   
 * @Package yxs.springjms   
 * @Description:    TODO(��һ�仰�������ļ���ʲô)   
 * @author: Ԫ��˧     
 * @date:   2020��8��12�� ����8:35:14   
 * @version 
 * @Copyright: 2020 yxs. All rights reserved. 
 */
package yxs.springjms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: TestQueue
 * @Description:���Ե�Ե㷢����Ϣ
 * @author: Ԫ��˧
 * @date: 2020��8��12�� ����8:35:14
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/yxs/springjms/applicationContext-jms-producer.xml")
public class TestSendMSQueue {

	@Autowired
	private QueueProducer queueProducer;

	@Test
	public void testSend() {
		queueProducer.sendTextMessage("SpringJms-��Ե�");
	}

}
