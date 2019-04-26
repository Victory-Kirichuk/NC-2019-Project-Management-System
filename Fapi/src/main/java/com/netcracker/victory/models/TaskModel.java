package com.netcracker.victory.models;

import java.sql.Date;

public class TaskModel {
    private int taskId;
    private String code;
    private String name;
    private int projectId;
    private int statusId;
    private int priorityId;

    private Date createDate;
    private Date updateDate;
    private Date dueDate;
    private Date resolvedDate;
    private Date closedDate;

    private int estimation;
    private int assign;
    private String description;
    private int reporter;

    private ProjectModel projectByProjectId;
    private StatusModel statusByStatusId;
    private PriorityModel priorityByPriorityId;
    private UserModel userByAssign;
    private UserModel userByReporter;

    public TaskModel() {
    }

    public TaskModel(int taskId, String code, String name, int projectId, int statusId, int priorityId, Date createDate, Date updateDate, Date dueDate, Date resolvedDate, Date closedDate, int estimation, int assign, String description, int reporter, ProjectModel projectByProjectId, StatusModel statusByStatusId, PriorityModel priorityByPriorityId, UserModel userByAssign, UserModel userByReporter) {
        this.taskId = taskId;
        this.code = code;
        this.name = name;
        this.projectId = projectId;
        this.statusId = statusId;
        this.priorityId = priorityId;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.dueDate = dueDate;
        this.resolvedDate = resolvedDate;
        this.closedDate = closedDate;
        this.estimation = estimation;
        this.assign = assign;
        this.description = description;
        this.reporter = reporter;
        this.projectByProjectId = projectByProjectId;
        this.statusByStatusId = statusByStatusId;
        this.priorityByPriorityId = priorityByPriorityId;
        this.userByAssign = userByAssign;
        this.userByReporter = userByReporter;
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

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
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

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public ProjectModel getProjectByProjectId() {
        return projectByProjectId;
    }

    public void setProjectByProjectId(ProjectModel projectByProjectId) {
        this.projectByProjectId = projectByProjectId;
    }

    public StatusModel getStatusByStatusId() {
        return statusByStatusId;
    }

    public void setStatusByStatusId(StatusModel statusByStatusId) {
        this.statusByStatusId = statusByStatusId;
    }

    public PriorityModel getPriorityByPriorityId() {

        return priorityByPriorityId;
    }

    public void setPriorityByPriorityId(PriorityModel priorityByPriorityId) {
        this.priorityByPriorityId = priorityByPriorityId;
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
