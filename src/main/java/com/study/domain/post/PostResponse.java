package com.study.domain.post;

import java.time.LocalDateTime;

public class PostResponse {
    private Long id; // PK
    private String title; // 제목
    private String content; // 내용
    private String writer; // 작성자
    private int viewCnt; // 조회수
    private Boolean noticeYn; // 공지글 여부
    private Boolean deleteYn; // 삭제 여부
    private LocalDateTime createdDate; // 생성 일시
    private LocalDateTime modifiedDate; // 최종 수정 일시

    // Getter
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public String getWriter() {
        return writer;
    }
    public int getViewCnt() {
        return viewCnt;
    }
    public Boolean getNoticeYn() {
        return noticeYn;
    }
    public Boolean getDeleteYn() {
        return deleteYn;
    }
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }
}
