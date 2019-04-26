package com.netcracker.victory.models.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.netcracker.victory.DateSerializer;
import com.netcracker.victory.models.TaskModel;

import java.sql.Date;

public class TaskDTO {
    private int taskId;
    private String code;
    private String name;
    private String projectCode;
    private String status;
    private String priority;
    @JsonSerialize(using = DateSerializer.class)
    private Date createDate;
    @JsonSerialize(using = DateSerializer.class)
    private Date updateDate;
    @JsonSerialize(using = DateSerializer.class)
    private Date dueDate;
    @JsonSerialize(using = DateSerializer.class)
    private Date resolvedDate;
    @JsonSerialize(using = DateSerializer.class)
    private Date closedDate;
    private int estimation;
    private String assign;
    private String description;
    private String reporter;

    public TaskDTO() {
    }

    public TaskDTO(int taskId, String code, String name, String projectCode, String status, String priority, Date createDate, Date updateDate, Date dueDate, Date resolvedDate, Date closedDate, int estimation, String assign, String description, String reporter) {
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

    public TaskDTO(TaskModel taskModel) {
        this(
                taskModel.getTaskId(),
                taskModel.getCode(),
                taskModel.getName(),
                taskModel.getProjectByProjectId().getProjectCode(),
                taskModel.getStatusByStatusId().getStatus(),
                taskModel.getPriorityByPriorityId().getPriority(),
                taskModel.getCreateDate(),
                taskModel.getUpdateDate(),
                taskModel.getDueDate(),
                taskModel.getResolvedDate(),
                taskModel.getClosedDate(),
                taskModel.getEstimation(),
                taskModel.getUserByAssign().getSurname() +" "+ taskModel.getUserByAssign().getName(),
                taskModel.getDescription(),
                taskModel.getUserByReporter().getSurname() +" "+ taskModel.getUserByReporter().getName()
        );
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(Date resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    public Integer getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
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
