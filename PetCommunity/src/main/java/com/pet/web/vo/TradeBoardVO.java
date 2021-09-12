package com.pet.web.vo;

import lombok.Data;

@Data
public class TradeBoardVO {
	private int TradeBoardNum;        	  // 거래게시판 번호(PK)
	private String TradeBoardTitle;       // 거래게시판 제목 
	private String TradeBoardContent;     // 거래게시판 내용
	private String TradeBoardIndate;      // 거래게시판 작성일
	private int TradeBoardHits;           // 거래게시판 조회수
	private String TradeBoardThumbnailOr; // 거래게시판 썸네일이름(원본)
	private String TradeBoardThumbnailSt; // 거래게시판 썸네일이름(저장)
	private String memberId;		      // 작성자
}
