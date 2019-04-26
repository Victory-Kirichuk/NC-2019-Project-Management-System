package com.netcracker.victory.backend.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "comment", schema = "pms", catalog = "")
public class CommentEntity {
    private int commentId;
    private String comment;
    private int author;
    private Date creation;
    private int taskId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "author")
    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    @Basic
    @Column(name = "creation")
    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    @Basic
    @Column(name = "task_id")
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentEntity that = (CommentEntity) o;

        if (commentId != that.commentId) return false;
        if (author != that.author) return false;
        if (taskId != that.taskId) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        return creation != null ? creation.equals(that.creation) : that.creation == null;

    }

    @Override
    public int hashCode() {
        int result = commentId;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + author;
        result = 31 * result + (creation != null ? creation.hashCode() : 0);
        result = 31 * result + taskId;
        return result;
    }
}
