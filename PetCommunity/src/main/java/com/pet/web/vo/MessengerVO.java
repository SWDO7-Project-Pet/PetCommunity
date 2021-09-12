package com.pet.web.vo;

import lombok.Data;

@Data
public class MessengerVO {
	private int messengerNum;			// 메신저 번호
	private String sender;				// 보낸사람
	private String receiver;			// 받는사람
	private String messengerContent;	// 보낸내용
	private String messengerIndate;		// 보낸시간
}
