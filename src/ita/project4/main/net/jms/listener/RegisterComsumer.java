package ita.project4.main.net.jms.listener;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import ita.project4.main.po.Merchant;

import ita.project4.main.service.MerchantService;
import ita.project4.main.util.JsonUtils;

public class RegisterComsumer implements MessageListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(RegisterComsumer.class);

	private JmsTemplate jmsTemplate;
	
	@Autowired
	private MerchantService merchantService ;

	@Override
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
			try {
				final String request = textMessage.getText();
				LOGGER.info(request);
//				System.out.println(request);
				Merchant m = JsonUtils.toObject(request,Merchant.class);
				System.out.println(m.toString());
				m.setmStatus(1);
				m.setmScore(10);
				merchantService.saveMerchant(m);
			} catch (JMSException e) {
				LOGGER.error("接收信息出错", e);
			}
		}
	}

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

}
