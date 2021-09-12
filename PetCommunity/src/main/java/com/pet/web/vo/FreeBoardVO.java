package com.pet.web.vo;

import lombok.Data;

@Data
public class FreeBoardVO {
	private int FreeBoardNum;        // 자유게시판 번호(PK)
	private String FreeBoardTitle;   // 자유게시판 제목 
	private String FreeBoardContent; // 자유게시판 내용
	private String FreeBoardIndate;  // 자유게시판 작성일
	private int FreeBoardHits;       // 자유게시판 조회수
	private int FreeBoardLikes;      // 자유게시판 좋아요수
	private String FreeBoardPhotoOr; // 자유게시판 사진이름(원본)
	private String FreeBoardPhotoSt; // 자유게시판 사진이름(저장)
	private String memberId;		 // 작성자
	
}
