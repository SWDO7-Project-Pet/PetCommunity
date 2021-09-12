package com.pet.web.vo;

import lombok.Data;

@Data
public class PhotoBoardVO {
	private int PhotoBoardNum;        	  // 사진게시판 번호(PK)
	private String PhotoBoardTitle;       // 사진게시판 제목 
	private String PhotoBoardContent;     // 사진게시판 내용
	private String PhotoBoardIndate;      // 사진게시판 작성일
	private int PhotoBoardHits;           // 사진게시판 조회수
	private int PhotoBoardLikes;          // 사진게시판 좋아요수
	private String PhotoBoardThumbnailOr; // 사진게시판 썸네일이름(원본)
	private String PhotoBoardThumbnailSt; // 사진게시판 썸네일이름(저장)
	private String memberId;		      // 작성자
}
