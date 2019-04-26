package com.netcracker.victory.backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "priority", schema = "pms", catalog = "")
public class PriorityEntity {
    private int priorityId;
    private String priority;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "priority_id")
    public int getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(int priorityId) {
        this.priorityId = priorityId;
    }

    @Basic
    @Column(name = "priority")
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PriorityEntity that = (PriorityEntity) o;

        if (priorityId != that.priorityId) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = priorityId;
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        return result;
    }
}
