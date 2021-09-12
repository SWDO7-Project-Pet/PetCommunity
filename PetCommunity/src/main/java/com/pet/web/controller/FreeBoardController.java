package com.pet.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/freeBoard")
public class FreeBoardController {
	// 자유게시판 컨트롤러
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/freeBoardMain", method = RequestMethod.GET)
	public String freeBoardMain() {
		logger.info("freeBoardMain 메소드 실행(GET)");
		
		return "freeBoard/freeBoardMain";
	}
}
