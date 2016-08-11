package ita.project4.main.net.jms.listener;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class ComplainComsumer implements MessageListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(ComplainComsumer.class);

	private JmsTemplate conTemplate;

	public JmsTemplate getConTemplate() {
		return conTemplate;
	}

	public void setConTemplate(JmsTemplate conTemplate) {
		this.conTemplate = conTemplate;
	}

	@Override
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
			try {
				final String request = textMessage.getText();
				LOGGER.info(request);
				System.out.println(request);
				
//				Destination destination = textMessage.getJMSReplyTo();
//				final String jmsCorrelationID = textMessage.getJMSCorrelationID();
//				jmsTemplate.send(destination, new MessageCreator() {
//
//					@Override
//					public Message createMessage(Session session) throws JMSException {
//						Message msg = session.createTextMessage(request + "的应答！");
//						msg.setJMSCorrelationID(jmsCorrelationID);
//						return msg;
//					}
//				});
			} catch (JMSException e) {
				LOGGER.error("接收信息出错", e);
			}
		}
	}

}
