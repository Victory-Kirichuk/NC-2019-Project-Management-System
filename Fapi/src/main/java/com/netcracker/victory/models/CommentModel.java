package com.netcracker.victory.models;

import java.sql.Date;

public class CommentModel {
    private int commentId;
    private String comment;
    private int author;
    private Date creation;
    private Integer taskId;

    public CommentModel(int commentId, String comment, int author, Date creation, Integer taskId) {
        this.commentId = commentId;
        this.comment = comment;
        this.author = author;
        this.creation = creation;
        this.taskId = taskId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
}
