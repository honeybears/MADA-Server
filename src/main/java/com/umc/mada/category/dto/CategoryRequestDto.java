package com.umc.mada.category.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

// 카테고리 생성 또는 수정 시 요청 데이터를 전달하는 DTO 클래스
@Data
public class CategoryRequestDto {
    private String categoryName; // 카테고리명
    private String color; // 카테고리 색상
    private Integer iconId; //아이콘 ID
}