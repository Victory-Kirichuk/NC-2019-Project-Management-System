package com.netcracker.victory.backend.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "comment", schema = "pms", catalog = "")
public class CommentEntity {
    private int commentId;
    private String comment;
    private Date creation;
    private Integer taskId;
    private UsersEntity usersByAuthor;

    @Id
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
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (creation != null ? !creation.equals(that.creation) : that.creation != null) return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentId;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (creation != null ? creation.hashCode() : 0);
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "author", referencedColumnName = "user_id", nullable = false)
    public UsersEntity getUsersByAuthor() {
        return usersByAuthor;
    }

    public void setUsersByAuthor(UsersEntity usersByAuthor) {
        this.usersByAuthor = usersByAuthor;
    }
}
