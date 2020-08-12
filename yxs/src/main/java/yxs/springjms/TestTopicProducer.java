/**  
 * All rights Reserved, Designed By YuanXiaoShuai
 * @Title:  TestTopicProducer.java   
 * @Package yxs.springjms   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 元晓帅     
 * @date:   2020年8月12日 下午8:47:18   
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
 * @ClassName: TestTopicProducer
 * @Description:测试发布订阅生产者
 * @author: 元晓帅
 * @date: 2020年8月12日 下午8:47:18
 * 
 * @Copyright: 2020 yxs. All rights reserved.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/yxs/springjms/applicationContext-jms-producer.xml")
public class TestTopicProducer {
	@Autowired
	private TopicProducer topicProducer;

	/**
	 * @Title: TestTopicProducer @Description: TODO(这里用一句话描述这个方法的作用) @param: @throws
	 */
	public TestTopicProducer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param: @param args @return:
	 *         void @throws
	 */
	@Test
	public void testSendTopicQueue() {
		// TODO Auto-generated method stub
		topicProducer.sendTextMessage("spring jsm 发布订阅");

	}

}
