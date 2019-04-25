package com.netcracker.victory.models.DTO;

import java.sql.Date;
import java.sql.Timestamp;

public class TaskDTO {
    private int taskId;
    private String code;
    private String name;
    private String projectCode;
    private String status;
    private String priority;
    private Timestamp createDate;
    private Timestamp updateDate;
    private Date dueDate;
    private Timestamp resolvedDate;
    private Timestamp closedDate;
    private Integer estimation;
    private String assign;
    private String description;
    private String reporter;

    public TaskDTO(int taskId, String code, String name, String projectCode, String status, String priority, Timestamp createDate, Timestamp updateDate, Date dueDate, Timestamp resolvedDate, Timestamp closedDate, Integer estimation, String assign, String description,String reporter) {
        this.taskId = taskId;
        this.code = code;
        this.name = name;
        this.projectCode = projectCode;
        this.status = status;
        this.priority = priority;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.dueDate = dueDate;
        this.resolvedDate = resolvedDate;
        this.closedDate = closedDate;
        this.estimation = estimation;
        this.assign = assign;
        this.description = description;
        this.reporter = reporter;
    }

    public TaskDTO() {
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Timestamp getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(Timestamp resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    public Timestamp getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Timestamp closedDate) {
        this.closedDate = closedDate;
    }

    public Integer getEstimation() {
        return estimation;
    }

    public void setEstimation(Integer estimation) {
        this.estimation = estimation;
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }
}
