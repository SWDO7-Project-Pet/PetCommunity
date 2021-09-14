package com.pet.web.dao;

import com.pet.web.vo.MemberVO;

public interface MemberMapper {

	int join(MemberVO member);

	String login(MemberVO loginMember);

}
