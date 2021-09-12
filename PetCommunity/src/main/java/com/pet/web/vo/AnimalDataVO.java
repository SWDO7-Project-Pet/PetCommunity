package com.pet.web.vo;

import lombok.Data;

@Data
public class AnimalDataVO {
	private int animalNum;				// 동물정보 번호	
	private String animalKind;			// 동물 종류
	private String animalThumbnailOr;	// 동물정보 썸내일(원본)
	private String animalThumbnailSt;	// 동물정보 썸내일(저장)
	private String animalVariety;		// 동물 품종
	private String animalOutline;		// 동물 설명
	private String memberId;			// 작성자(관리자)
}