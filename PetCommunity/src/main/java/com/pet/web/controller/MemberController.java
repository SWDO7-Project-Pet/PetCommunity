package com.pet.web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pet.web.service.MemberService;
import com.pet.web.vo.MemberVO;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	// 회원 컨트롤러
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		logger.info("join 메소드 실행(GET)");
		
		return "member/join";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		logger.info("login 메소드 실행(GET)");
		
		return "member/login";
	}
	
	@RequestMapping(value = "/setting", method = RequestMethod.GET)
	public String setting() {
		logger.info("setting 메소드 실행(GET)");
		
		return "member/setting";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(MemberVO member) {
		logger.info("join 메소드 실행(POST)");
		logger.info("member: {}", member);
		
		boolean result = service.join(member);
		
		String returnUrl;
		if(result) {
			returnUrl = "redirect:/";
			logger.info("회원가입 성공");
		} else {
			returnUrl = "member/join";
			logger.info("회원가입 실패");
		}
		return returnUrl;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String memberId, String memberPw, HttpSession session) {
		logger.info("login 메소드 실행(POST)");
		
		logger.info("memberId: {}", memberId);
		logger.info("memberPw: {}", memberPw);
		
		String login = service.login(memberId, memberPw);
		logger.info("login: {}", login);
		
		String returnUrl;
		if(login == null) {
			logger.info("로그인 실패");
			returnUrl = "member/login";
		} else {
			logger.info("로그인 성공");
			session.setAttribute("memberId", memberId);
			returnUrl = "redirect:/";
		}
		return returnUrl;
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		logger.info("logout 메소드 실행(GET)");
		
		session.removeAttribute("memberId");
		
		return "redirect:/";
	}
}
