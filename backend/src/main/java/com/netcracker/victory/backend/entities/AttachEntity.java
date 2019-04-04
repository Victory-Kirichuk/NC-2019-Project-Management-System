package com.netcracker.victory.backend.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "attach", schema = "pms", catalog = "")
public class AttachEntity {
    private int attachId;
    private String attach;
    private Date dateCr;
    private Integer taskId;

    @Id
    @Column(name = "attach_id")
    public int getAttachId() {
        return attachId;
    }

    public void setAttachId(int attachId) {
        this.attachId = attachId;
    }

    @Basic
    @Column(name = "attach")
    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    @Basic
    @Column(name = "date_cr")
    public Date getDateCr() {
        return dateCr;
    }

    public void setDateCr(Date dateCr) {
        this.dateCr = dateCr;
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

        AttachEntity that = (AttachEntity) o;

        if (attachId != that.attachId) return false;
        if (attach != null ? !attach.equals(that.attach) : that.attach != null) return false;
        if (dateCr != null ? !dateCr.equals(that.dateCr) : that.dateCr != null) return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attachId;
        result = 31 * result + (attach != null ? attach.hashCode() : 0);
        result = 31 * result + (dateCr != null ? dateCr.hashCode() : 0);
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        return result;
    }
}
