package com.study.domain.post;

public class PostRequest {
    private Long id; // PK
    private String title; // 제목
    private String content; // 내용
    private String writer; // 작성자
    private Boolean noticeYn; // 공지글 여부

    // Setter
    public void setId(Long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public void setNoticeYn(Boolean noticeYn) {
        this.noticeYn = noticeYn;
    }

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
    public Boolean getNoticeYn() {
        return noticeYn;
    }
}
