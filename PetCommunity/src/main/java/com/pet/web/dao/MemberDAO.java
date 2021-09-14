package com.pet.web.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pet.web.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession session;

	public int join(MemberVO member) {
		int result = 0;
		MemberMapper mapper = null;
		try {
			mapper = session.getMapper(MemberMapper.class);
			result = mapper.join(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public String login(MemberVO loginMember) {
		String result = null;
		MemberMapper mapper = null;
		try {
			mapper = session.getMapper(MemberMapper.class);
			result = mapper.login(loginMember);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
