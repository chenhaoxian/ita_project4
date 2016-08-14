package ita.project4.main.net.jms.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import ita.project4.main.po.Order;
import ita.project4.main.service.OrderService;

public class ComplainComsumer implements MessageListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(ComplainComsumer.class);

	private JmsTemplate conTemplate;

	public JmsTemplate getConTemplate() {
		return conTemplate;
	}

	public void setConTemplate(JmsTemplate conTemplate) {
		this.conTemplate = conTemplate;
	}
	
	@Autowired
	private OrderService orderService;

	@Override
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
			try {
				final String request = textMessage.getText();
				LOGGER.info(request);
				System.out.println(request);
				int oId = Integer.parseInt(request.split("#")[0]);
				String mBrand = request.split("#")[1];
				Order o = new Order();
				o.setoId(oId);
				o.setmBrand(mBrand);
				o.setoStatus(1);
				orderService.saveOrder(o);
			} catch (JMSException e) {
				LOGGER.error("接收信息出错", e);
			}
		}
	}

}
