package com.netcracker.victory.models;

import java.sql.Date;

public class AttachModel {
    private int attachId;
    private String attach;
    private Date dateCreation;
    private int taskId;

    public AttachModel(int attachId, String attach, Date dateCreation, int taskId) {
        this.attachId = attachId;
        this.attach = attach;
        this.dateCreation = dateCreation;
        this.taskId = taskId;
    }

    public AttachModel() {
    }

    public int getAttachId() {
        return attachId;
    }

    public void setAttachId(int attachId) {
        this.attachId = attachId;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }


}
