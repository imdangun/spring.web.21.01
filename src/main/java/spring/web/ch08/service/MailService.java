package spring.web.ch08.service;

import spring.web.ch08.domain.Message;

public interface MailService {
	void send(Message msg);
}
