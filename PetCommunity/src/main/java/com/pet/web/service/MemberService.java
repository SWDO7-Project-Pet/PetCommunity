package com.pet.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet.web.dao.MemberDAO;
import com.pet.web.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO dao;

	public boolean join(MemberVO member) {
		return dao.join(member) > 0 ? true : false;
	}

	public String login(String memberId, String memberPw) {
		MemberVO  loginMember = new MemberVO();
		
		loginMember.setMemberId(memberId);
		loginMember.setMemberPw(memberPw);
		
		return dao.login(loginMember);
	}

}
