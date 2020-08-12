/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  TestQueue.java   
 * @Package yxs.springjms   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月12日 下午8:35:14   
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
 * @Description:测试点对点发送消息
 * @author: 元晓帅
 * @date: 2020年8月12日 下午8:35:14
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
		queueProducer.sendTextMessage("SpringJms-点对点");
	}

}
