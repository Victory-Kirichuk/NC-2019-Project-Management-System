package com.netcracker.victory.models;

import java.sql.Date;
import java.sql.Timestamp;

public class TaskModel {
    private int taskId;
    private String code;
    private String name;
    private int projectId;
    private int statusId;
    private int priorityId;
    private Timestamp createDate;
    private Timestamp updateDate;
    private Date dueDate;
    private Timestamp resolvedDate;
    private Timestamp closedDate;
    private Integer estimation;
    private int assign;
    private String description;
    private int reporter;

    private ProjectModel projectByProject;
    private StatusModel statusByStatus;
    private PriorityModel priorityByPriority;
    private UserModel userByAssign;
    private UserModel userByReporter;




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

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public int getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(int priorityId) {
        this.priorityId = priorityId;
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

    public int getAssign() {
        return assign;
    }

    public void setAssign(int assign) {
        this.assign = assign;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReporter() {
        return reporter;
    }

    public void setReporter(int reporter) {
        this.reporter = reporter;
    }

    public int getTaskId() {
        return taskId;
    }

    public ProjectModel getProjectByProject() {
        return projectByProject;
    }

    public void setProjectByProject(ProjectModel projectByProject) {
        this.projectByProject = projectByProject;
    }

    public StatusModel getStatusByStatus() {
        return statusByStatus;
    }

    public void setStatusByStatus(StatusModel statusByStatus) {
        this.statusByStatus = statusByStatus;
    }

    public PriorityModel getPriorityByPriority() {
        return priorityByPriority;
    }

    public void setPriorityByPriority(PriorityModel priorityByPriority) {
        this.priorityByPriority = priorityByPriority;
    }

    public UserModel getUserByAssign() {
        return userByAssign;
    }

    public void setUserByAssign(UserModel userByAssign) {
        this.userByAssign = userByAssign;
    }

    public UserModel getUserByReporter() {
        return userByReporter;
    }

    public void setUserByReporter(UserModel userByReporter) {
        this.userByReporter = userByReporter;
    }
}
