package com.netcracker.victory.models;


import java.util.Objects;

public class ProjectModel {
    private int projectId;
    private String projectName;
    private String projectCode;
    private String summary;

    public ProjectModel(int projectId, String projectName, String projectCode, String summary) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.summary = summary;
    }


    public ProjectModel() {

    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


}
