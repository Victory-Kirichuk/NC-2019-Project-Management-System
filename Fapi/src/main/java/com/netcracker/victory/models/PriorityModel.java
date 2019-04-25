package com.netcracker.victory.models;

public class PriorityModel {
    private int priorityId;
    private String priority;

    public PriorityModel(int priorityId, String priority) {
        this.priorityId = priorityId;
        this.priority = priority;
    }

    public PriorityModel() {
    }

    public int getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(int priorityId) {
        this.priorityId = priorityId;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }


}
