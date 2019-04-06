package com.netcracker.victory.backend.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tasks", schema = "pms", catalog = "")
public class TaskEntity {
    private int taskId;
    private String ticketCode;
    private String taskName;
    private int projectId;
    private int status;
    private int priority;
    private Date createDate;
    private Date updateDate;
    private Date dueDate;
    private Date resolvedDate;
    private Date closedDate;
    private String estimation;
    private int userId;
    private String description;
    private int reporter;
    private ProjectEntity projectsByProjectId;
    private StatusEntity statusesByStatus;
    private PriorityEntity prioritiesByPriority;
    private UserEntity usersByUserId;
    private UserEntity usersByReporter;

    @Id
    @Column(name = "task_id")
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "ticketCode")
    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    @Basic
    @Column(name = "task_name")
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Basic
    @Column(name = "project_id")
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "priority")
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "update_date")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "due_date")
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Basic
    @Column(name = "resolved_date")
    public Date getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(Date resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    @Basic
    @Column(name = "closed_date")
    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    @Basic
    @Column(name = "estimation")
    public String getEstimation() {
        return estimation;
    }

    public void setEstimation(String estimation) {
        this.estimation = estimation;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "reporter")
    public int getReporter() {
        return reporter;
    }

    public void setReporter(int reporter) {
        this.reporter = reporter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskEntity that = (TaskEntity) o;

        if (taskId != that.taskId) return false;
        if (projectId != that.projectId) return false;
        if (status != that.status) return false;
        if (priority != that.priority) return false;
        if (userId != that.userId) return false;
        if (reporter != that.reporter) return false;
        if (ticketCode != null ? !ticketCode.equals(that.ticketCode) : that.ticketCode != null) return false;
        if (taskName != null ? !taskName.equals(that.taskName) : that.taskName != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;
        if (dueDate != null ? !dueDate.equals(that.dueDate) : that.dueDate != null) return false;
        if (resolvedDate != null ? !resolvedDate.equals(that.resolvedDate) : that.resolvedDate != null) return false;
        if (closedDate != null ? !closedDate.equals(that.closedDate) : that.closedDate != null) return false;
        if (estimation != null ? !estimation.equals(that.estimation) : that.estimation != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskId;
        result = 31 * result + (ticketCode != null ? ticketCode.hashCode() : 0);
        result = 31 * result + (taskName != null ? taskName.hashCode() : 0);
        result = 31 * result + projectId;
        result = 31 * result + status;
        result = 31 * result + priority;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (dueDate != null ? dueDate.hashCode() : 0);
        result = 31 * result + (resolvedDate != null ? resolvedDate.hashCode() : 0);
        result = 31 * result + (closedDate != null ? closedDate.hashCode() : 0);
        result = 31 * result + (estimation != null ? estimation.hashCode() : 0);
        result = 31 * result + userId;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + reporter;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "project_id", nullable = false,insertable = false, updatable = false)
    public ProjectEntity getProjectsByProjectId() {
        return projectsByProjectId;
    }

    public void setProjectsByProjectId(ProjectEntity projectsByProjectId) {
        this.projectsByProjectId = projectsByProjectId;
    }

    @ManyToOne
    @JoinColumn(name = "status", referencedColumnName = "status_id", nullable = false,insertable = false, updatable = false)
    public StatusEntity getStatusesByStatus() {
        return statusesByStatus;
    }

    public void setStatusesByStatus(StatusEntity statusesByStatus) {
        this.statusesByStatus = statusesByStatus;
    }

    @ManyToOne()
    @JoinColumn(name = "priority", referencedColumnName = "priority_id", nullable = false,insertable = false, updatable = false)
    public PriorityEntity getPrioritiesByPriority() {
        return prioritiesByPriority;
    }

    public void setPrioritiesByPriority(PriorityEntity prioritiesByPriority) {
        this.prioritiesByPriority = prioritiesByPriority;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false,insertable = false, updatable = false)
    public UserEntity getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(UserEntity usersByUserId) {
        this.usersByUserId = usersByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "reporter", referencedColumnName = "user_id", nullable = false,insertable = false, updatable = false)
    public UserEntity getUsersByReporter() {
        return usersByReporter;
    }

    public void setUsersByReporter(UserEntity usersByReporter) {
        this.usersByReporter = usersByReporter;
    }
}
