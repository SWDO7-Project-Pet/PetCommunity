package com.pet.web.vo;

import lombok.Data;

@Data
public class FreeReplyVO {
	private int FreeReplyNum;			// 자유게시판 댓글번호
	private String FreeReplyContent;	// 자유게시판 댓글내용
	private String FreeReplyIndate;		// 자유게시판 댓글작성일
	private int FreeBoardNum;			// 자유게시판 글번호
	private String memberId;			// 자유게시판 댓글작성자
}
