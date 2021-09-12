package com.pet.web.vo;

import lombok.Data;

@Data
public class TradeBoardSaveVO {
	private int TradeboardNum;           // 거래게시판 번호
	private String TradeBoardPhotoOr;    // 거래게시판 사진(원본)
	private String TradeBoardPhotoSt;    // 거래게시판 사진(저장)
}
